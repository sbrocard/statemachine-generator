package net.sb.statemachine.generator.services;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import net.sb.statemachine.dsl.stm.Event;
import net.sb.statemachine.dsl.stm.SelfEvent;
import net.sb.statemachine.dsl.stm.State;
import net.sb.statemachine.dsl.stm.Statemachine;
import net.sb.statemachine.dsl.stm.Transition;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class Utility {

	private static final String COMPLETION = "completion";
	private boolean enableAnotations_ = false;
	private final EventComparator eventComparator_ = new EventComparator();
	private final Map<State, Integer> state2Id_ = new HashMap<State, Integer>();
	private final Map<State, String> state2Name_ = new HashMap<State, String>();

	private final Map<Event, Integer> event2Id_ = new HashMap<Event, Integer>();
	private final Map<Event, String> event2Name_ = new HashMap<Event, String>();

	public Utility() {
	}

	public String getOverrideAnnotation() {
		if(enableAnotations_) {
			return "@Override";
		}
		else
			return "//@Override";
	}

	public Collection<State> getAllStates(Statemachine stateMachine) {
		List<State> result = new ArrayList<State>();
		getAllStates_(stateMachine.getStates(), result);

		return result;
	}
	
	public State getStartingState(Statemachine statemachine) {
		return getAllStates(statemachine).iterator().next();
	}
	
	private void getAllStates_(List<State> states, List<State> result) {
		for (State state : states) {
			result.add(state);
			getAllStates_(state.getStates(), result);
		}
	}

	public Map<Event, Collection<Transition>> groupEvents(State state) {
		return groupEvents_(state.getTransitions(), new IGet<Transition, Event>() {

			@Override
			public Event get(Transition o) {
				return o.getEvent();
			}
		});
	}

	private interface IGet<T, E> {
		E get(T o);
	}
	
	public Map<Event, Collection<SelfEvent>> groupSelfEvents(State state) {
		return groupEvents_(state.getSelfEvents(), new IGet<SelfEvent, Event>() {

			@Override
			public Event get(SelfEvent o) {
				return o.getEvent();
			}
		});
	}

	public Collection<SelfEvent> getSelfEvents(State state, Event event) {
		Collection<SelfEvent> results = new ArrayList<SelfEvent>();
		Collection<SelfEvent> selfEvents = groupSelfEvents(state).get(event);
		boolean transitionWithGuard = false; // if true, stop the generation of the following transitions, and do not add the trailing break
		for (SelfEvent selfEvent : selfEvents) {
			if (selfEvent.getGuard() == null) {
				transitionWithGuard = true;
				results.add(selfEvent);
				break;
			} else {
				if (! transitionWithGuard) {
					results.add(selfEvent);
				}
			} // end else
		} // for
		return results;
	}

	public Collection<Transition> getTransitions(State state, Event event) {
		Collection<Transition> results = new ArrayList<Transition>();
		Collection<Transition> transitions = groupEvents(state).get(event);
		boolean transitionWithGuard = false; // if true, stop the generation of the following transitions, and do not add the trailing break
		for (Transition transition : transitions) {
			if (transition.getGuard() == null) {
				transitionWithGuard = true;
				results.add(transition);
				break;
			} else {
				if (! transitionWithGuard) {
					results.add(transition);
				}
			} // end else
		} // for
		return results;
	}

	private <T> Map<Event, Collection<T>> groupEvents_(Collection<T> elements, IGet<T, Event> get) {
		Map<Event, Collection<T>> event2SelfEvents = new TreeMap<Event, Collection<T>>(eventComparator_);
		for(T selfEvent : elements) {
			Event event = get.get(selfEvent);
			Collection<T> selfEvents = event2SelfEvents.get(event);
			if (selfEvents == null) {
				selfEvents = new ArrayList<T>();
				event2SelfEvents.put(event, selfEvents);
			}
			selfEvents.add(selfEvent);
		}
		return event2SelfEvents;
		
	}
	

	public boolean isEnableAnotations() {
		return enableAnotations_;
	}

	public void setEnableAnotations(boolean enableAnotations) {
		enableAnotations_ = enableAnotations;
	}
	
	/** Find the ID of the state.
	 * TODO the case where the state is not found (should never happen) is not handled
	 * @param state
	 * @return the id of the state
	 */
	public int stateID(State state) {
		Statemachine stateMachine = getStateMachine(state);
		Integer id = state2Id_.get(state);
		if (id == null) {
			visitStates_(state, stateMachine.getStates(), 0, "");
			id = state2Id_.get(state);
		}
		return id.intValue();
	}
	
	/** Find the name of the state.
	 * TODO the case where the state is not found (should never happen) is not handled
	 * @param state
	 * @return the name of the state
	 */
	public String stateName(State state) {
		Statemachine stateMachine = getStateMachine(state);
		String name = state2Name_.get(state);
		if (name == null) {
			visitStates_(state, stateMachine.getStates(), 0, "");
			name = state2Name_.get(state);
		}
		return name;
	}

	public Statemachine getStateMachine(State state) {
		EObject eContainer = state.eContainer();
		while (eContainer instanceof Statemachine == false && eContainer != null) {
			eContainer = eContainer.eContainer();
		}
		Statemachine stateMachine = (Statemachine) eContainer;
		return stateMachine;
	}
	
	public Statemachine getStateMachine(Event state) {
		EObject eContainer = state.eContainer();
		while (eContainer instanceof Statemachine == false && eContainer != null) {
			eContainer = eContainer.eContainer();
		}
		Statemachine stateMachine = (Statemachine) eContainer;
		return stateMachine;
	}
	
	private int visitStates_(State stateToFind, List<State> states, int i, String prefix) {
		for (State state : states) {
			i++;
			if (state2Id_.containsKey(stateToFind))
				break;
			String stateName = prefix + state.getName();

			if (stateToFind == state) {
				state2Id_.put(stateToFind, i);
				state2Name_.put(stateToFind, "STATE_" + stateName);
			}
			i = visitStates_(stateToFind, state.getStates(), i, stateName + "_");
		}
		return i;
	}
//	
//	public Collection<State> getExitedStates(State originState) {
//		List<States2ExitedStates> states2ExitedStates = getStates2ExitedStates(getStateMachine(originState));
//		Collection<State> result = new ArrayList<State>();
//		for (States2ExitedStates states2ExitedStates2 : states2ExitedStates) {
//			if (originState == states2ExitedStates2.getOriginState()) {
//				Collection<States2ExitActions> exitedStates = states2ExitedStates2.getExitedStates();
//				for (States2ExitActions states2ExitActions : exitedStates) {
//					result.addAll(states2ExitActions.getExitedStates());
//				}
//			}
//		}
//		return result;
// 	}
//	
//	public Collection<State> getStatesWithExitedStates(Statemachine statemachine) {
//		List<States2ExitedStates> states2ExitedStates = getStates2ExitedStates(statemachine);
//		Collection<State> result = new ArrayList<State>();
//		for (States2ExitedStates states2ExitedStates2 : states2ExitedStates) {
//			result.add(states2ExitedStates2.getOriginState());
//		}
//		return result;
// 	}
	
	public List<States2ExitedStates> getStates2ExitedStates(Statemachine statemachine) {
		List<States2ExitedStates> result = new ArrayList<States2ExitedStates>();

		getStates2ExitedStates_(statemachine.getStates(), result);
		
		return result;
 	}
	
	public State getOriginalState(States2ExitedStates item) {
		return item.getOriginState();
	}
	
	public Collection<States2ExitActions> getExitedStates(States2ExitedStates item) {
		return item.getExitedStates();	
	}
	
	public Collection<State> getStatesStates2ExitActions(States2ExitActions exitedStates) {
		return exitedStates.getStates();	
	}

	public Collection<State> getExitedStatesStates2ExitActions(States2ExitActions exitedStates) {
		return exitedStates.getExitedStates();	
	}

	private void getStates2ExitedStates_(List<State> states, List<States2ExitedStates> result) {
		for (State state : states) {
			States2ExitedStates states2ExitedStates = new States2ExitedStates(state);

			EList<Transition> transitions = state.getTransitions();
			for (Transition transition : transitions) {
				State transitionState = transition.getState();
				List<State> parentStatesList = new ArrayList<State>();
				
				EObject eContainer = state.eContainer();
				if (eContainer != null && eContainer instanceof State) {
					State parentState = (State)eContainer;
					while (eContainer != null && eContainer instanceof State) {
						parentState = (State)eContainer;
						// is target state a sibling
						if (!parentState.getStates().contains(transitionState)) {
							parentStatesList.add(parentState);
							eContainer = parentState.eContainer();
						}
						else {
							break;
						}
					}
				}
				
				if (parentStatesList.size() > 0) {
					boolean merged = false;
					// is there an entry with the same parentStatesList ? Add the state.
					for (States2ExitActions states2ExitActions : states2ExitedStates.getExitedStates()) {
						List<State> exitedStates2 = states2ExitActions.getExitedStates();
						if (exitedStates2.size() == parentStatesList.size()) {
							boolean foundSameList = true;
							for (int i = 0; i < parentStatesList.size(); ++i) {
								if (parentStatesList.get(i).equals(exitedStates2.get(i)) == false) {
									foundSameList = false;
									break;
								}
							}
							if (foundSameList) {
								merged = true;
								if (!states2ExitActions.getStates().contains(transitionState)) {
									states2ExitActions.addState(transitionState);
								}
								break;
							}
						}
					}
				
					if (!merged) {
						States2ExitActions caseItem = new States2ExitActions();
						states2ExitedStates.getExitedStates().add(caseItem);
						caseItem.addState(transitionState);
						for (State state2 : parentStatesList) {
							caseItem.addExitedStates(state2);
						}
					}
				}
			}
			if (states2ExitedStates.getExitedStates().size() > 0) {
				result.add(states2ExitedStates);
			}
			
			getStates2ExitedStates_(state.getStates(), result);
		}
	}
	
	public boolean handleCompletionEvent(State state) {
		EList<Transition> transitions = state.getTransitions();
		for (Transition transition : transitions) {
			if (transition.getEvent().getName().equals(COMPLETION)) {
				return true;
			}
		}
		EList<SelfEvent> selfEvents = state.getSelfEvents();
		for (SelfEvent selfEvent : selfEvents) {
			if (selfEvent.getEvent().equals(COMPLETION)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean hasState(Collection<State> states) {
		for (State state : states) {
			if(handleCompletionEvent(state)) {
				return true;
			}
		}
		return false;
	}	
	
	/** Find the ID of the state.
	 * TODO the case where the state is not found (should never happen) is not handled
	 * @param event
	 * @return the id of the state
	 */
	public int eventID(Event event) {
		Statemachine stateMachine = getStateMachine(event);
		Integer id = state2Id_.get(event);
		if (id == null) {
			visitEvents_(event, stateMachine.getEvents(), 0, "");
			id = event2Id_.get(event);
		}
		return id.intValue();
	}

	private int visitEvents_(Event eventToFind, List<Event> events, int i, String prefix) {
		for (Event event : events) {
			i++;
			if (event2Id_.containsKey(eventToFind))
				break;
			String name = prefix + event.getName();
	
			if (eventToFind == event) {
				event2Id_.put(eventToFind, i);
				event2Name_.put(eventToFind, "EVENT_" + name);
			}
		}
		return i;
	}

	/** Find the name of the event.
	 * TODO the case where the event is not found (should never happen) is not handled
	 * @param event
	 * @return the name of the event
	 */
	public String eventName(Event event) {
		Statemachine stateMachine = getStateMachine(event);
		String name = event2Name_.get(event);
		if (name == null) {
			visitEvents_(event, stateMachine.getEvents(), -1/*could be 0*/, "");
			name = event2Name_.get(event);
		}
		return name;
	}

}
