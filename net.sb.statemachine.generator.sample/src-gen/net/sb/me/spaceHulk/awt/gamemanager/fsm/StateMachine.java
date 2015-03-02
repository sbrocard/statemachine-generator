/**
* This code is generated
*/
package net.sb.me.spaceHulk.awt.gamemanager.fsm;

import net.sb.me.spaceHulk.awt.gamemanager.fsm.ICommands;
import net.sb.me.spaceHulk.awt.gamemanager.fsm.IContext;
import net.sb.me.spaceHulk.awt.gamemanager.fsm.IGuards;
import net.sb.me.spaceHulk.awt.gamemanager.fsm.IStateMachine;

public class StateMachine implements IStateMachine {
	private int startingState_ = STATE_enter;
	private int state_ = NOT_STARTED;
	private ICommands commands_;
	private IGuards guards_;
	private boolean generateException_ = false;

	public StateMachine(ICommands commands, IGuards guards) {
		commands_ = commands;
		guards_ = guards;
	}

	//@Override
	public void start() {
		enterState_(-1, getStartingState(), null);
	}
	
	public boolean isGenerateException() {
		return generateException_;
	}

	public void setGenerateException(boolean generateException) {
		generateException_ = generateException;
	}
	
	//@Override
	public int getState() {
		return state_;
	}

	/**
	 * Protected for the tests
	 */
	protected void setState_(int state) {
		state_ = state;
	}

	//@Override
	public int getStartingState() {
		return startingState_;
	}

	//@Override
	public void postEvent(int event, IContext context) {
		processEvent_(event, context);
	}
	protected void processEvent_(final int event, final IContext context) {
		processEventImpl_(event, context);
	}

	private void STATE_enter_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_completion: {
				if(guards_.isSelectMarine(context)) {
					executeActionFreeTransition_(EVENT_completion, STATE_selectMarine, context);
					break;
				}
				if(guards_.isNoActivatedMarine(context)) {
					executeActionFreeTransition_(EVENT_completion, STATE_noActivatedMarine, context);
					break;
				}
				if(guards_.isFire(context)) {
					executeActionFreeTransition_(EVENT_completion, STATE_fire, context);
					break;
				}
				if(guards_.isMoveSpaceMarine(context)) {
					executeActionFreeTransition_(EVENT_completion, STATE_moveActivated, context);
					break;
				}
				executeActionFreeTransition_(EVENT_completion, STATE_nope, context);
				break;
			}
			default:
				String error = "no transition on state STATE_enter, event " + 
					 event;
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}

	private boolean STATE_selectMarine_selfEvent_(int event, IContext context) {
		boolean eventConsumed = false;
		switch (event) {
			case EVENT_click:
				commands_.selectLocation(context); 
				eventConsumed = true;
				break;
			case EVENT_doubleClick:
				commands_.selectLocationAndValidate(context); 
				eventConsumed = true;
				break;
			case EVENT_dragged:
				commands_.dragScreen(context); 
				eventConsumed = true;
				break;

		}
		return eventConsumed;
	}


	private boolean STATE_noActivatedMarine_selfEvent_(int event, IContext context) {
		boolean eventConsumed = false;
		switch (event) {
			case EVENT_click:
				if(guards_.isMarineSelected(context)) {
					commands_.selectMarine(context); 
					eventConsumed = true;
					break;
				}
				break;
			case EVENT_doubleClick:
				if(guards_.isMarineSelected(context)) {
					commands_.activateMarine(context); 
					eventConsumed = true;
					break;
				}
				commands_.selectLocation(context); 
				eventConsumed = true;
				break;
			case EVENT_dragged:
				commands_.dragScreen(context); 
				eventConsumed = true;
				break;

		}
		return eventConsumed;
	}


	private boolean STATE_fire_selfEvent_(int event, IContext context) {
		boolean eventConsumed = false;
		switch (event) {
			case EVENT_click:
				commands_.selectLocation(context); 
				eventConsumed = true;
				break;
			case EVENT_doubleClick:
				commands_.selectLocationAndValidate(context); 
				eventConsumed = true;
				break;
			case EVENT_dragged:
				commands_.dragScreen(context); 
				eventConsumed = true;
				break;

		}
		return eventConsumed;
	}


	private boolean STATE_moveActivated_selfEvent_(int event, IContext context) {
		boolean eventConsumed = false;
		switch (event) {
			case EVENT_click:
				commands_.moveSpaceMarine(context); 
				eventConsumed = true;
				break;
			case EVENT_doubleClick:
				if(guards_.isSpaceMarineClicked(context)) {
					commands_.validate(context); 
					eventConsumed = true;
					break;
				}
				commands_.autoAction(context); 
				eventConsumed = true;
				break;
			case EVENT_dragged:
				commands_.dragScreen(context); 
				eventConsumed = true;
				break;

		}
		return eventConsumed;
	}




	protected void processEventImpl_(int event, IContext context) {
		boolean eventConsumed = false;
		// self events
		switch (state_) {
			case STATE_selectMarine:
				eventConsumed = STATE_selectMarine_selfEvent_(event, context);
				break;
			case STATE_noActivatedMarine:
				eventConsumed = STATE_noActivatedMarine_selfEvent_(event, context);
				break;
			case STATE_fire:
				eventConsumed = STATE_fire_selfEvent_(event, context);
				break;
			case STATE_moveActivated:
				eventConsumed = STATE_moveActivated_selfEvent_(event, context);
				break;
		} // end switch
		
		if (eventConsumed) return;
		
		// transitions
		switch (state_) {
			case STATE_enter:
				STATE_enter_transitions_(event, context);
				break;
		} // end switch
	}

	/**
	 * protected for the tests
	 */
	protected void exitState_(int event, int targetState, IContext context) {
		exitActions_(state_, targetState, context);
	}
	
	private void executeActionFreeTransition_(int event, int targetState, IContext context) {
		exitState_(event, targetState, context);
		
		enterState_(event, targetState, context);
	}
	
	/**
	 * protected for the tests
	 */
	protected void enterState_(int event, int state, IContext context) {
		setState_(state);
		
		entryActions_(context);
	
			if (!enterSubState_(event, context)) {
				fireCompletionEvent_(context);
			}
	}

	private void fireCompletionEvent_(IContext context) {
		switch(state_) {
		case STATE_enter:
			postEvent(EVENT_completion, context);
			break;
		}
	}
	
	private boolean enterSubState_(int event, IContext context) {
		switch (state_) {
		} // end switch
		return false;
	}

	
	private void exitActions_(int currentState, int targetState, IContext context) {		
		exitActionsUnit_(currentState, context);
		
		// execute exit actions of the parent states
		switch (currentState) {
		} // end switch currentState
	}

	/**
	 * for the tests
	 */
	protected void exitActionsUnit_(int currentState, IContext context) {
		switch (currentState) {
		}
	}

	private void entryActions_(IContext context) {
		switch (state_) {
		}
	}
	
}
