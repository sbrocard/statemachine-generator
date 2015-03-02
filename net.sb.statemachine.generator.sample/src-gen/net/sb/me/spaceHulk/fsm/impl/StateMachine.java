/**
* This code is generated
*/
package net.sb.me.spaceHulk.fsm.impl;

import net.sb.me.spaceHulk.fsm.ICommands;
import net.sb.me.spaceHulk.fsm.IContext;
import net.sb.me.spaceHulk.fsm.IGuards;
import net.sb.me.spaceHulk.fsm.IStateMachine;
import net.sb.me.spaceHulk.fsm.StateMachineUtils;

public abstract class StateMachine implements IStateMachine {
	private int startingState_ = STATE_STARTING;
	private int state_ = NOT_STARTED;
	private ICommands commands_;
	private IGuards guards_;
	private boolean generateException_ = false;
	private static interface IRunnable extends Runnable {
		void stop();
	}
	
	private IRunnable runnable_ = null;
	private Thread activityThread_ = null;

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
		System.out.println(StateMachineUtils.stateToString(state_));
	}

	//@Override
	public int getStartingState() {
		return startingState_;
	}

	//@Override
	public void postEvent(int event, IContext context) {
		processEvent_(event, context);
	}
	protected abstract void processEvent_(int event, IContext context);

	private void STATE_STARTING_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_startGame: {
				executeActionFreeTransition_(EVENT_startGame, STATE_PLACE_SPACE_MARINES, context);
				break;
			}
			default:
				String error = "no transition on state STATE_STARTING, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}



	private boolean STATE_PLACE_SPACE_MARINES_SELECT_LOCATION_selfEvent_(int event, IContext context) {
		boolean eventConsumed = false;
		switch (event) {
			case EVENT_DOWN:
				commands_.moveTargetDown(context); fireSelfEvent_(this, EVENT_DOWN, context);
				eventConsumed = true;
				break;
			case EVENT_DOWNLEFT:
				commands_.moveTargetDownLeft(context); fireSelfEvent_(this, EVENT_DOWNLEFT, context);
				eventConsumed = true;
				break;
			case EVENT_DOWNRIGHT:
				commands_.moveTargetDownRight(context); fireSelfEvent_(this, EVENT_DOWNRIGHT, context);
				eventConsumed = true;
				break;
			case EVENT_LEFT:
				commands_.moveTargetLeft(context); fireSelfEvent_(this, EVENT_LEFT, context);
				eventConsumed = true;
				break;
			case EVENT_LOCATION_SELECTED:
				commands_.targetOnSelectedLocation(context); fireSelfEvent_(this, EVENT_LOCATION_SELECTED, context);
				eventConsumed = true;
				break;
			case EVENT_RIGHT:
				commands_.moveTargetRight(context); fireSelfEvent_(this, EVENT_RIGHT, context);
				eventConsumed = true;
				break;
			case EVENT_UP:
				commands_.moveTargetUp(context); fireSelfEvent_(this, EVENT_UP, context);
				eventConsumed = true;
				break;
			case EVENT_UPLEFT:
				commands_.moveTargetUpLeft(context); fireSelfEvent_(this, EVENT_UPLEFT, context);
				eventConsumed = true;
				break;
			case EVENT_UPRIGHT:
				commands_.moveTargetUpRight(context); fireSelfEvent_(this, EVENT_UPRIGHT, context);
				eventConsumed = true;
				break;

		}
		return eventConsumed;
	}

	private void STATE_PLACE_SPACE_MARINES_SELECT_LOCATION_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_VALIDATE: {
				if(guards_.canPlaceLastSpaceMarine(context)) {
					executeActionFreeTransition_(EVENT_VALIDATE, STATE_PLACE_SPACE_MARINES_PLACED_LAST, context);
					break;
				}
				if(guards_.canPlaceSpaceMarine(context)) {
					executeActionFreeTransition_(EVENT_VALIDATE, STATE_PLACE_SPACE_MARINES_PLACED, context);
					break;
				}
				break;
			}
			default:
				String error = "no transition on state STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}

	private boolean STATE_PLACE_SPACE_MARINES_PLACED_selfEvent_(int event, IContext context) {
		boolean eventConsumed = false;
		switch (event) {
			case EVENT_ROTATELEFT:
				commands_.rotateLeftOnArea(context); fireSelfEvent_(this, EVENT_ROTATELEFT, context);
				eventConsumed = true;
				break;
			case EVENT_ROTATERIGHT:
				commands_.rotateRightOnArea(context); fireSelfEvent_(this, EVENT_ROTATERIGHT, context);
				eventConsumed = true;
				break;
			case EVENT_VALIDATE:
				commands_.rotateLeftOnArea(context); fireSelfEvent_(this, EVENT_VALIDATE, context);
				eventConsumed = true;
				break;

		}
		return eventConsumed;
	}

	private void STATE_PLACE_SPACE_MARINES_PLACED_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_DOWN: {
				if(guards_.areaFinished(context)) {
					executeActionFreeTransition_(EVENT_DOWN, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
					break;
				}
				exitState_(EVENT_DOWN, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context); commands_.moveTargetDown(context); enterState_(EVENT_DOWN, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
				break;
			}
			case EVENT_DOWNLEFT: {
				if(guards_.areaFinished(context)) {
					executeActionFreeTransition_(EVENT_DOWNLEFT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
					break;
				}
				exitState_(EVENT_DOWNLEFT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context); commands_.moveTargetDownLeft(context); enterState_(EVENT_DOWNLEFT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
				break;
			}
			case EVENT_DOWNRIGHT: {
				if(guards_.areaFinished(context)) {
					executeActionFreeTransition_(EVENT_DOWNRIGHT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
					break;
				}
				exitState_(EVENT_DOWNRIGHT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context); commands_.moveTargetDownRight(context); enterState_(EVENT_DOWNRIGHT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
				break;
			}
			case EVENT_LEFT: {
				if(guards_.areaFinished(context)) {
					executeActionFreeTransition_(EVENT_LEFT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
					break;
				}
				exitState_(EVENT_LEFT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context); commands_.moveTargetLeft(context); enterState_(EVENT_LEFT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
				break;
			}
			case EVENT_LOCATION_SELECTED: {
				if(guards_.areaFinished(context)) {
					executeActionFreeTransition_(EVENT_LOCATION_SELECTED, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
					break;
				}
				exitState_(EVENT_LOCATION_SELECTED, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context); commands_.targetOnSelectedLocation(context); enterState_(EVENT_LOCATION_SELECTED, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
				break;
			}
			case EVENT_RIGHT: {
				if(guards_.areaFinished(context)) {
					executeActionFreeTransition_(EVENT_RIGHT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
					break;
				}
				exitState_(EVENT_RIGHT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context); commands_.moveTargetRight(context); enterState_(EVENT_RIGHT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
				break;
			}
			case EVENT_UP: {
				if(guards_.areaFinished(context)) {
					executeActionFreeTransition_(EVENT_UP, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
					break;
				}
				exitState_(EVENT_UP, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context); commands_.moveTargetUp(context); enterState_(EVENT_UP, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
				break;
			}
			case EVENT_UPLEFT: {
				if(guards_.areaFinished(context)) {
					executeActionFreeTransition_(EVENT_UPLEFT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
					break;
				}
				exitState_(EVENT_UPLEFT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context); commands_.moveTargetUpLeft(context); enterState_(EVENT_UPLEFT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
				break;
			}
			case EVENT_UPRIGHT: {
				if(guards_.areaFinished(context)) {
					executeActionFreeTransition_(EVENT_UPRIGHT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
					break;
				}
				exitState_(EVENT_UPRIGHT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context); commands_.moveTargetUpRight(context); enterState_(EVENT_UPRIGHT, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
				break;
			}
			default:
				String error = "no transition on state STATE_PLACE_SPACE_MARINES_PLACED, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}

	private boolean STATE_PLACE_SPACE_MARINES_PLACED_LAST_selfEvent_(int event, IContext context) {
		boolean eventConsumed = false;
		switch (event) {
			case EVENT_ROTATELEFT:
				commands_.rotateLeftOnArea(context); fireSelfEvent_(this, EVENT_ROTATELEFT, context);
				eventConsumed = true;
				break;
			case EVENT_ROTATERIGHT:
				commands_.rotateRightOnArea(context); fireSelfEvent_(this, EVENT_ROTATERIGHT, context);
				eventConsumed = true;
				break;
			case EVENT_VALIDATE:
				commands_.rotateLeftOnArea(context); fireSelfEvent_(this, EVENT_VALIDATE, context);
				eventConsumed = true;
				break;

		}
		return eventConsumed;
	}

	private void STATE_PLACE_SPACE_MARINES_PLACED_LAST_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_DOWN: {
				exitState_(EVENT_DOWN, STATE_PLACE_SPACE_MARINES_FINISHED, context); commands_.moveTargetDown(context); enterState_(EVENT_DOWN, STATE_PLACE_SPACE_MARINES_FINISHED, context);
				break;
			}
			case EVENT_DOWNLEFT: {
				exitState_(EVENT_DOWNLEFT, STATE_PLACE_SPACE_MARINES_FINISHED, context); commands_.moveTargetDownLeft(context); enterState_(EVENT_DOWNLEFT, STATE_PLACE_SPACE_MARINES_FINISHED, context);
				break;
			}
			case EVENT_DOWNRIGHT: {
				exitState_(EVENT_DOWNRIGHT, STATE_PLACE_SPACE_MARINES_FINISHED, context); commands_.moveTargetDownRight(context); enterState_(EVENT_DOWNRIGHT, STATE_PLACE_SPACE_MARINES_FINISHED, context);
				break;
			}
			case EVENT_ENDSPACEMARINEROUND: {
				executeActionFreeTransition_(EVENT_ENDSPACEMARINEROUND, STATE_PLACE_SPACE_MARINES_FINISHED, context);
				break;
			}
			case EVENT_LEFT: {
				exitState_(EVENT_LEFT, STATE_PLACE_SPACE_MARINES_FINISHED, context); commands_.moveTargetLeft(context); enterState_(EVENT_LEFT, STATE_PLACE_SPACE_MARINES_FINISHED, context);
				break;
			}
			case EVENT_LOCATION_SELECTED: {
				executeActionFreeTransition_(EVENT_LOCATION_SELECTED, STATE_PLACE_SPACE_MARINES_FINISHED, context);
				break;
			}
			case EVENT_RIGHT: {
				exitState_(EVENT_RIGHT, STATE_PLACE_SPACE_MARINES_FINISHED, context); commands_.moveTargetRight(context); enterState_(EVENT_RIGHT, STATE_PLACE_SPACE_MARINES_FINISHED, context);
				break;
			}
			case EVENT_UP: {
				exitState_(EVENT_UP, STATE_PLACE_SPACE_MARINES_FINISHED, context); commands_.moveTargetUp(context); enterState_(EVENT_UP, STATE_PLACE_SPACE_MARINES_FINISHED, context);
				break;
			}
			case EVENT_UPLEFT: {
				exitState_(EVENT_UPLEFT, STATE_PLACE_SPACE_MARINES_FINISHED, context); commands_.moveTargetUpLeft(context); enterState_(EVENT_UPLEFT, STATE_PLACE_SPACE_MARINES_FINISHED, context);
				break;
			}
			case EVENT_UPRIGHT: {
				exitState_(EVENT_UPRIGHT, STATE_PLACE_SPACE_MARINES_FINISHED, context); commands_.moveTargetUpRight(context); enterState_(EVENT_UPRIGHT, STATE_PLACE_SPACE_MARINES_FINISHED, context);
				break;
			}
			default:
				String error = "no transition on state STATE_PLACE_SPACE_MARINES_PLACED_LAST, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}


	private void STATE_PLACE_SPACE_MARINES_FINISHED_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_completion: {
				if(guards_.artifactsToPlace(context)) {
					executeActionFreeTransition_(EVENT_completion, STATE_SPACE_ARTIFACT, context);
					break;
				}
				executeActionFreeTransition_(EVENT_completion, STATE_START_FIRST_ROUND, context);
				break;
			}
			default:
				String error = "no transition on state STATE_PLACE_SPACE_MARINES_FINISHED, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}



	private boolean STATE_SPACE_ARTIFACT_SELECT_selfEvent_(int event, IContext context) {
		boolean eventConsumed = false;
		switch (event) {
			case EVENT_DOWN:
				commands_.scrollDown(context); fireSelfEvent_(this, EVENT_DOWN, context);
				eventConsumed = true;
				break;
			case EVENT_DOWNLEFT:
				commands_.scrollDownLeft(context); fireSelfEvent_(this, EVENT_DOWNLEFT, context);
				eventConsumed = true;
				break;
			case EVENT_DOWNRIGHT:
				commands_.scrollDownRight(context); fireSelfEvent_(this, EVENT_DOWNRIGHT, context);
				eventConsumed = true;
				break;
			case EVENT_LEFT:
				commands_.scrollLeft(context); fireSelfEvent_(this, EVENT_LEFT, context);
				eventConsumed = true;
				break;
			case EVENT_LOCATION_SELECTED:
				commands_.centerOnLocation(context); fireSelfEvent_(this, EVENT_LOCATION_SELECTED, context);
				eventConsumed = true;
				break;
			case EVENT_RIGHT:
				commands_.scrollRight(context); fireSelfEvent_(this, EVENT_RIGHT, context);
				eventConsumed = true;
				break;
			case EVENT_UP:
				commands_.scrollUp(context); fireSelfEvent_(this, EVENT_UP, context);
				eventConsumed = true;
				break;
			case EVENT_UPLEFT:
				commands_.scrollUpLeft(context); fireSelfEvent_(this, EVENT_UPLEFT, context);
				eventConsumed = true;
				break;
			case EVENT_UPRIGHT:
				commands_.scrollUpRight(context); fireSelfEvent_(this, EVENT_UPRIGHT, context);
				eventConsumed = true;
				break;

		}
		return eventConsumed;
	}

	private void STATE_SPACE_ARTIFACT_SELECT_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_SELECT_SPACE_MARINE: {
				exitState_(EVENT_SELECT_SPACE_MARINE, STATE_SPACE_ARTIFACT_SELECTED, context); commands_.clearMessageBar(context); enterState_(EVENT_SELECT_SPACE_MARINE, STATE_SPACE_ARTIFACT_SELECTED, context);
				break;
			}
			default:
				String error = "no transition on state STATE_SPACE_ARTIFACT_SELECT, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}

	private boolean STATE_SPACE_ARTIFACT_SELECTED_selfEvent_(int event, IContext context) {
		boolean eventConsumed = false;
		switch (event) {
			case EVENT_LOCATION_SELECTED:
				commands_.centerOnLocation(context); fireSelfEvent_(this, EVENT_LOCATION_SELECTED, context);
				eventConsumed = true;
				break;

		}
		return eventConsumed;
	}

	private void STATE_SPACE_ARTIFACT_SELECTED_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_DOWN: {
				exitState_(EVENT_DOWN, STATE_SPACE_ARTIFACT_SELECT, context); commands_.scrollDown(context); enterState_(EVENT_DOWN, STATE_SPACE_ARTIFACT_SELECT, context);
				break;
			}
			case EVENT_DOWNLEFT: {
				exitState_(EVENT_DOWNLEFT, STATE_SPACE_ARTIFACT_SELECT, context); commands_.scrollDownLeft(context); enterState_(EVENT_DOWNLEFT, STATE_SPACE_ARTIFACT_SELECT, context);
				break;
			}
			case EVENT_DOWNRIGHT: {
				exitState_(EVENT_DOWNRIGHT, STATE_SPACE_ARTIFACT_SELECT, context); commands_.scrollDownRight(context); enterState_(EVENT_DOWNRIGHT, STATE_SPACE_ARTIFACT_SELECT, context);
				break;
			}
			case EVENT_LEFT: {
				exitState_(EVENT_LEFT, STATE_SPACE_ARTIFACT_SELECT, context); commands_.scrollLeft(context); enterState_(EVENT_LEFT, STATE_SPACE_ARTIFACT_SELECT, context);
				break;
			}
			case EVENT_RIGHT: {
				exitState_(EVENT_RIGHT, STATE_SPACE_ARTIFACT_SELECT, context); commands_.scrollRight(context); enterState_(EVENT_RIGHT, STATE_SPACE_ARTIFACT_SELECT, context);
				break;
			}
			case EVENT_SELECT_SPACE_MARINE: {
				executeActionFreeTransition_(EVENT_SELECT_SPACE_MARINE, STATE_SPACE_ARTIFACT_SELECTED, context);
				break;
			}
			case EVENT_UP: {
				exitState_(EVENT_UP, STATE_SPACE_ARTIFACT_SELECT, context); commands_.scrollUp(context); enterState_(EVENT_UP, STATE_SPACE_ARTIFACT_SELECT, context);
				break;
			}
			case EVENT_UPLEFT: {
				exitState_(EVENT_UPLEFT, STATE_SPACE_ARTIFACT_SELECT, context); commands_.scrollUpLeft(context); enterState_(EVENT_UPLEFT, STATE_SPACE_ARTIFACT_SELECT, context);
				break;
			}
			case EVENT_UPRIGHT: {
				exitState_(EVENT_UPRIGHT, STATE_SPACE_ARTIFACT_SELECT, context); commands_.scrollUpRight(context); enterState_(EVENT_UPRIGHT, STATE_SPACE_ARTIFACT_SELECT, context);
				break;
			}
			case EVENT_VALIDATE: {
				if(guards_.notLastArtifactToPlace(context)) {
					exitState_(EVENT_VALIDATE, STATE_SPACE_ARTIFACT_SELECT, context); commands_.placeArtifact(context); enterState_(EVENT_VALIDATE, STATE_SPACE_ARTIFACT_SELECT, context);
					break;
				}
				exitState_(EVENT_VALIDATE, STATE_START_FIRST_ROUND, context); commands_.placeArtifact(context); enterState_(EVENT_VALIDATE, STATE_START_FIRST_ROUND, context);
				break;
			}
			default:
				String error = "no transition on state STATE_SPACE_ARTIFACT_SELECTED, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}


	private void STATE_START_FIRST_ROUND_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_completion: {
				if(guards_.stealersPlayFirst(context)) {
					executeActionFreeTransition_(EVENT_completion, STATE_STEALERS, context);
					break;
				}
				exitState_(EVENT_completion, STATE_SPACE_MARINE, context); commands_.addStartingBlips(context); enterState_(EVENT_completion, STATE_SPACE_MARINE, context);
				break;
			}
			default:
				String error = "no transition on state STATE_START_FIRST_ROUND, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}



	private boolean STATE_SPACE_MARINE_SPACE_MARINE_selfEvent_(int event, IContext context) {
		boolean eventConsumed = false;
		switch (event) {
			case EVENT_DOWN:
				commands_.scrollDown(context); fireSelfEvent_(this, EVENT_DOWN, context);
				eventConsumed = true;
				break;
			case EVENT_DOWNLEFT:
				commands_.scrollDownLeft(context); fireSelfEvent_(this, EVENT_DOWNLEFT, context);
				eventConsumed = true;
				break;
			case EVENT_DOWNRIGHT:
				commands_.scrollDownRight(context); fireSelfEvent_(this, EVENT_DOWNRIGHT, context);
				eventConsumed = true;
				break;
			case EVENT_LEFT:
				commands_.scrollLeft(context); fireSelfEvent_(this, EVENT_LEFT, context);
				eventConsumed = true;
				break;
			case EVENT_RIGHT:
				commands_.scrollRight(context); fireSelfEvent_(this, EVENT_RIGHT, context);
				eventConsumed = true;
				break;
			case EVENT_UP:
				commands_.scrollUp(context); fireSelfEvent_(this, EVENT_UP, context);
				eventConsumed = true;
				break;
			case EVENT_UPLEFT:
				commands_.scrollUpLeft(context); fireSelfEvent_(this, EVENT_UPLEFT, context);
				eventConsumed = true;
				break;
			case EVENT_UPRIGHT:
				commands_.scrollUpRight(context); fireSelfEvent_(this, EVENT_UPRIGHT, context);
				eventConsumed = true;
				break;

		}
		return eventConsumed;
	}

	private void STATE_SPACE_MARINE_SPACE_MARINE_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_ENDSPACEMARINEROUND: {
				executeActionFreeTransition_(EVENT_ENDSPACEMARINEROUND, STATE_STEALERS, context);
				break;
			}
			case EVENT_SELECT_SPACE_MARINE: {
				exitState_(EVENT_SELECT_SPACE_MARINE, STATE_SPACE_MARINE_SELECTED, context); commands_.clearMessageBar(context); enterState_(EVENT_SELECT_SPACE_MARINE, STATE_SPACE_MARINE_SELECTED, context);
				break;
			}
			case EVENT_VALIDATE: {
				if(guards_.currentPlayingSpaceMarine(context)) {
					exitState_(EVENT_VALIDATE, STATE_SPACE_MARINE_MOVE, context); commands_.activateCurrentPlayingSpaceMarine(context); enterState_(EVENT_VALIDATE, STATE_SPACE_MARINE_MOVE, context);
					break;
				}
				break;
			}
			default:
				String error = "no transition on state STATE_SPACE_MARINE_SPACE_MARINE, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}

	private boolean STATE_SPACE_MARINE_SELECTED_selfEvent_(int event, IContext context) {
		boolean eventConsumed = false;
		switch (event) {
			case EVENT_LOCATION_SELECTED:
				commands_.centerOnLocation(context); fireSelfEvent_(this, EVENT_LOCATION_SELECTED, context);
				eventConsumed = true;
				break;

		}
		return eventConsumed;
	}

	private void STATE_SPACE_MARINE_SELECTED_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_DOWN: {
				exitState_(EVENT_DOWN, STATE_SPACE_MARINE_SPACE_MARINE, context); commands_.scrollDown(context); enterState_(EVENT_DOWN, STATE_SPACE_MARINE_SPACE_MARINE, context);
				break;
			}
			case EVENT_DOWNLEFT: {
				exitState_(EVENT_DOWNLEFT, STATE_SPACE_MARINE_SPACE_MARINE, context); commands_.scrollDownLeft(context); enterState_(EVENT_DOWNLEFT, STATE_SPACE_MARINE_SPACE_MARINE, context);
				break;
			}
			case EVENT_DOWNRIGHT: {
				exitState_(EVENT_DOWNRIGHT, STATE_SPACE_MARINE_SPACE_MARINE, context); commands_.scrollDownRight(context); enterState_(EVENT_DOWNRIGHT, STATE_SPACE_MARINE_SPACE_MARINE, context);
				break;
			}
			case EVENT_ENDSPACEMARINEROUND: {
				executeActionFreeTransition_(EVENT_ENDSPACEMARINEROUND, STATE_STEALERS, context);
				break;
			}
			case EVENT_LEFT: {
				exitState_(EVENT_LEFT, STATE_SPACE_MARINE_SPACE_MARINE, context); commands_.scrollLeft(context); enterState_(EVENT_LEFT, STATE_SPACE_MARINE_SPACE_MARINE, context);
				break;
			}
			case EVENT_RIGHT: {
				exitState_(EVENT_RIGHT, STATE_SPACE_MARINE_SPACE_MARINE, context); commands_.scrollRight(context); enterState_(EVENT_RIGHT, STATE_SPACE_MARINE_SPACE_MARINE, context);
				break;
			}
			case EVENT_SELECT_SPACE_MARINE: {
				executeActionFreeTransition_(EVENT_SELECT_SPACE_MARINE, STATE_SPACE_MARINE_SELECTED, context);
				break;
			}
			case EVENT_UP: {
				exitState_(EVENT_UP, STATE_SPACE_MARINE_SPACE_MARINE, context); commands_.scrollUp(context); enterState_(EVENT_UP, STATE_SPACE_MARINE_SPACE_MARINE, context);
				break;
			}
			case EVENT_UPLEFT: {
				exitState_(EVENT_UPLEFT, STATE_SPACE_MARINE_SPACE_MARINE, context); commands_.scrollUpLeft(context); enterState_(EVENT_UPLEFT, STATE_SPACE_MARINE_SPACE_MARINE, context);
				break;
			}
			case EVENT_UPRIGHT: {
				exitState_(EVENT_UPRIGHT, STATE_SPACE_MARINE_SPACE_MARINE, context); commands_.scrollUpRight(context); enterState_(EVENT_UPRIGHT, STATE_SPACE_MARINE_SPACE_MARINE, context);
				break;
			}
			case EVENT_VALIDATE: {
				exitState_(EVENT_VALIDATE, STATE_SPACE_MARINE_MOVE, context); commands_.activateSelectedSpaceMarine(context); enterState_(EVENT_VALIDATE, STATE_SPACE_MARINE_MOVE, context);
				break;
			}
			default:
				String error = "no transition on state STATE_SPACE_MARINE_SELECTED, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}



	private boolean STATE_SPACE_MARINE_MOVE_ACTIVATED_selfEvent_(int event, IContext context) {
		boolean eventConsumed = false;
		switch (event) {
			case EVENT_ACTIVATE:
				commands_.activateArea(context); fireSelfEvent_(this, EVENT_ACTIVATE, context);
				eventConsumed = true;
				break;
			case EVENT_CANCELED:
				commands_.undoAction(context); fireSelfEvent_(this, EVENT_CANCELED, context);
				eventConsumed = true;
				break;
			case EVENT_CANCEL_OVERWATCH:
				commands_.cancelOverwatch(context); fireSelfEvent_(this, EVENT_CANCEL_OVERWATCH, context);
				eventConsumed = true;
				break;
			case EVENT_CLEAR_JAM:
				commands_.clearJam(context); fireSelfEvent_(this, EVENT_CLEAR_JAM, context);
				eventConsumed = true;
				break;
			case EVENT_DOWN:
				if(guards_.spaceMarineCanMove(context)) {
					commands_.moveDown(context); fireSelfEvent_(this, EVENT_DOWN, context);
					eventConsumed = true;
					break;
				}
				break;
			case EVENT_DOWNLEFT:
				if(guards_.spaceMarineCanMove(context)) {
					commands_.moveDownLeft(context); fireSelfEvent_(this, EVENT_DOWNLEFT, context);
					eventConsumed = true;
					break;
				}
				break;
			case EVENT_DOWNRIGHT:
				if(guards_.spaceMarineCanMove(context)) {
					commands_.moveDownRight(context); fireSelfEvent_(this, EVENT_DOWNRIGHT, context);
					eventConsumed = true;
					break;
				}
				break;
			case EVENT_DROP_ARTIFACT:
				commands_.dropArtifact(context); fireSelfEvent_(this, EVENT_DROP_ARTIFACT, context);
				eventConsumed = true;
				break;
			case EVENT_LEFT:
				if(guards_.spaceMarineCanMove(context)) {
					commands_.moveLeft(context); fireSelfEvent_(this, EVENT_LEFT, context);
					eventConsumed = true;
					break;
				}
				break;
			case EVENT_OPEN_CLOSE_DOOR:
				if(guards_.spaceMarineCanManipulateDoor(context, true)) {
					commands_.openCloseDoor(context); fireSelfEvent_(this, EVENT_OPEN_CLOSE_DOOR, context);
					eventConsumed = true;
					break;
				}
				break;
			case EVENT_OVERWATCH:
				commands_.overwatch(context); fireSelfEvent_(this, EVENT_OVERWATCH, context);
				eventConsumed = true;
				break;
			case EVENT_RELOAD:
				if(guards_.spaceMarineCanReload(context, true)) {
					commands_.reload(context); fireSelfEvent_(this, EVENT_RELOAD, context);
					eventConsumed = true;
					break;
				}
				break;
			case EVENT_RIGHT:
				if(guards_.spaceMarineCanMove(context)) {
					commands_.moveRight(context); fireSelfEvent_(this, EVENT_RIGHT, context);
					eventConsumed = true;
					break;
				}
				break;
			case EVENT_ROTATELEFT:
				if(guards_.spaceMarineCanMove(context)) {
					commands_.rotateLeft(context); fireSelfEvent_(this, EVENT_ROTATELEFT, context);
					eventConsumed = true;
					break;
				}
				break;
			case EVENT_ROTATERIGHT:
				if(guards_.spaceMarineCanMove(context)) {
					commands_.rotateRight(context); fireSelfEvent_(this, EVENT_ROTATERIGHT, context);
					eventConsumed = true;
					break;
				}
				break;
			case EVENT_TAKE_ARTIFACT:
				commands_.takeArtifact(context); fireSelfEvent_(this, EVENT_TAKE_ARTIFACT, context);
				eventConsumed = true;
				break;
			case EVENT_UP:
				if(guards_.spaceMarineCanMove(context)) {
					commands_.moveUp(context); fireSelfEvent_(this, EVENT_UP, context);
					eventConsumed = true;
					break;
				}
				break;
			case EVENT_UPLEFT:
				if(guards_.spaceMarineCanMove(context)) {
					commands_.moveUpLeft(context); fireSelfEvent_(this, EVENT_UPLEFT, context);
					eventConsumed = true;
					break;
				}
				break;
			case EVENT_UPRIGHT:
				if(guards_.spaceMarineCanMove(context)) {
					commands_.moveUpRight(context); fireSelfEvent_(this, EVENT_UPRIGHT, context);
					eventConsumed = true;
					break;
				}
				break;

		}
		return eventConsumed;
	}

	private void STATE_SPACE_MARINE_MOVE_ACTIVATED_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_END_PLAYING: {
				executeActionFreeTransition_(EVENT_END_PLAYING, STATE_GAME_ENDED, context);
				break;
			}
			case EVENT_FIGHT: {
				if(guards_.spaceMarineCanFight(context, true)) {
					executeActionFreeTransition_(EVENT_FIGHT, STATE_SPACE_MARINE_MOVE_FIGHTING, context);
					break;
				}
				break;
			}
			case EVENT_FIRE: {
				if(guards_.spaceMarineCanFire(context, true)) {
					executeActionFreeTransition_(EVENT_FIRE, STATE_SPACE_MARINE_MOVE_FIRE, context);
					break;
				}
				break;
			}
			case EVENT_SPACE_MARINE_REMOVED: {
				if(guards_.noVictory(context)) {
					executeActionFreeTransition_(EVENT_SPACE_MARINE_REMOVED, STATE_SPACE_MARINE_SPACE_MARINE, context);
					break;
				}
				break;
			}
			case EVENT_VALIDATE: {
				executeActionFreeTransition_(EVENT_VALIDATE, STATE_SPACE_MARINE_SPACE_MARINE, context);
				break;
			}
			default:
				String error = "no transition on state STATE_SPACE_MARINE_MOVE_ACTIVATED, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}



	private boolean STATE_SPACE_MARINE_MOVE_FIRE_FIRING_selfEvent_(int event, IContext context) {
		boolean eventConsumed = false;
		switch (event) {
			case EVENT_DOWN:
				commands_.moveTargetDown(context); fireSelfEvent_(this, EVENT_DOWN, context);
				eventConsumed = true;
				break;
			case EVENT_DOWNLEFT:
				commands_.moveTargetDownLeft(context); fireSelfEvent_(this, EVENT_DOWNLEFT, context);
				eventConsumed = true;
				break;
			case EVENT_DOWNRIGHT:
				commands_.moveTargetDownRight(context); fireSelfEvent_(this, EVENT_DOWNRIGHT, context);
				eventConsumed = true;
				break;
			case EVENT_LEFT:
				commands_.moveTargetLeft(context); fireSelfEvent_(this, EVENT_LEFT, context);
				eventConsumed = true;
				break;
			case EVENT_LOCATION_SELECTED:
				commands_.targetOnSelectedLocation(context); fireSelfEvent_(this, EVENT_LOCATION_SELECTED, context);
				eventConsumed = true;
				break;
			case EVENT_RIGHT:
				commands_.moveTargetRight(context); fireSelfEvent_(this, EVENT_RIGHT, context);
				eventConsumed = true;
				break;
			case EVENT_UP:
				commands_.moveTargetUp(context); fireSelfEvent_(this, EVENT_UP, context);
				eventConsumed = true;
				break;
			case EVENT_UPLEFT:
				commands_.moveTargetUpLeft(context); fireSelfEvent_(this, EVENT_UPLEFT, context);
				eventConsumed = true;
				break;
			case EVENT_UPRIGHT:
				commands_.moveTargetUpRight(context); fireSelfEvent_(this, EVENT_UPRIGHT, context);
				eventConsumed = true;
				break;
			case EVENT_VALIDATE:
				if(guards_.spaceMarineCanFireOnTarget(context)) {
					commands_.fire(context); fireSelfEvent_(this, EVENT_VALIDATE, context);
					eventConsumed = true;
					break;
				}
				break;

		}
		return eventConsumed;
	}

	private void STATE_SPACE_MARINE_MOVE_FIRE_FIRING_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_CANCELED: {
				exitState_(EVENT_CANCELED, STATE_SPACE_MARINE_MOVE_ACTIVATED, context); commands_.setFlamerStateFalse(context); enterState_(EVENT_CANCELED, STATE_SPACE_MARINE_MOVE_ACTIVATED, context);
				break;
			}
			case EVENT_END_PLAYING: {
				executeActionFreeTransition_(EVENT_END_PLAYING, STATE_GAME_ENDED, context);
				break;
			}
			case EVENT_FIRED: {
				if(guards_.doubleShotWithTargetAvailable(context)) {
					executeActionFreeTransition_(EVENT_FIRED, STATE_SPACE_MARINE_MOVE_FIRE_DOUBLE_SHOT, context);
					break;
				}
				if(guards_.doubleShotNoTargetAvailableOrFiringSpaceMarineIsNotFlamer(context)) {
					executeActionFreeTransition_(EVENT_FIRED, STATE_SPACE_MARINE_MOVE_ACTIVATED, context);
					break;
				}
				break;
			}
			default:
				String error = "no transition on state STATE_SPACE_MARINE_MOVE_FIRE_FIRING, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}

	private boolean STATE_SPACE_MARINE_MOVE_FIRE_DOUBLE_SHOT_selfEvent_(int event, IContext context) {
		boolean eventConsumed = false;
		switch (event) {
			case EVENT_DOWN:
				commands_.moveDoubleShotTargetDown(context); fireSelfEvent_(this, EVENT_DOWN, context);
				eventConsumed = true;
				break;
			case EVENT_DOWNLEFT:
				commands_.moveDoubleShotTargetDownLeft(context); fireSelfEvent_(this, EVENT_DOWNLEFT, context);
				eventConsumed = true;
				break;
			case EVENT_DOWNRIGHT:
				commands_.moveDoubleShotTargetDownRight(context); fireSelfEvent_(this, EVENT_DOWNRIGHT, context);
				eventConsumed = true;
				break;
			case EVENT_LEFT:
				commands_.moveDoubleShotTargetLeft(context); fireSelfEvent_(this, EVENT_LEFT, context);
				eventConsumed = true;
				break;
			case EVENT_LOCATION_SELECTED:
				commands_.doubleShotSelectLocation(context); fireSelfEvent_(this, EVENT_LOCATION_SELECTED, context);
				eventConsumed = true;
				break;
			case EVENT_RIGHT:
				commands_.moveDoubleShotTargetRight(context); fireSelfEvent_(this, EVENT_RIGHT, context);
				eventConsumed = true;
				break;
			case EVENT_UP:
				commands_.moveDoubleShotTargetUp(context); fireSelfEvent_(this, EVENT_UP, context);
				eventConsumed = true;
				break;
			case EVENT_UPLEFT:
				commands_.moveDoubleShotTargetUpLeft(context); fireSelfEvent_(this, EVENT_UPLEFT, context);
				eventConsumed = true;
				break;
			case EVENT_UPRIGHT:
				commands_.moveDoubleShotTargetUpRight(context); fireSelfEvent_(this, EVENT_UPRIGHT, context);
				eventConsumed = true;
				break;
			case EVENT_VALIDATE:
				commands_.fireDoubleShot(context); fireSelfEvent_(this, EVENT_VALIDATE, context);
				eventConsumed = true;
				break;

		}
		return eventConsumed;
	}

	private void STATE_SPACE_MARINE_MOVE_FIRE_DOUBLE_SHOT_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_CANCELED: {
				executeActionFreeTransition_(EVENT_CANCELED, STATE_SPACE_MARINE_MOVE_ACTIVATED, context);
				break;
			}
			case EVENT_END_PLAYING: {
				executeActionFreeTransition_(EVENT_END_PLAYING, STATE_GAME_ENDED, context);
				break;
			}
			case EVENT_FIRED: {
				executeActionFreeTransition_(EVENT_FIRED, STATE_SPACE_MARINE_MOVE_ACTIVATED, context);
				break;
			}
			default:
				String error = "no transition on state STATE_SPACE_MARINE_MOVE_FIRE_DOUBLE_SHOT, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}


	private void STATE_SPACE_MARINE_MOVE_FIGHTING_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_END_PLAYING: {
				executeActionFreeTransition_(EVENT_END_PLAYING, STATE_GAME_ENDED, context);
				break;
			}
			case EVENT_EQUALITY: {
				executeActionFreeTransition_(EVENT_EQUALITY, STATE_SPACE_MARINE_MOVE_ACTIVATED, context);
				break;
			}
			case EVENT_SPACEMARINEDIES: {
				executeActionFreeTransition_(EVENT_SPACEMARINEDIES, STATE_SPACE_MARINE_SPACE_MARINE, context);
				break;
			}
			case EVENT_SPACEMARINEWINS: {
				executeActionFreeTransition_(EVENT_SPACEMARINEWINS, STATE_SPACE_MARINE_MOVE_ACTIVATED, context);
				break;
			}
			default:
				String error = "no transition on state STATE_SPACE_MARINE_MOVE_FIGHTING, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}


	private void STATE_STEALERS_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_END_PLAYING: {
				if(guards_.noVictory(context)) {
					terminateDoActivity_(); executeActionFreeTransition_(EVENT_END_PLAYING, STATE_SPACE_MARINE, context);
					break;
				}
				terminateDoActivity_(); executeActionFreeTransition_(EVENT_END_PLAYING, STATE_GAME_ENDED, context);
				break;
			}
			default:
				String error = "no transition on state STATE_STEALERS, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}


	private void STATE_GAME_ENDED_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_STOP_GAME: {
				exitState_(EVENT_STOP_GAME, STATE_QUIT_GAME, context); commands_.handleEndOfGame(context); enterState_(EVENT_STOP_GAME, STATE_QUIT_GAME, context);
				break;
			}
			default:
				String error = "no transition on state STATE_GAME_ENDED, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}



	protected void processEventImpl_(int event, IContext context) {
		boolean eventConsumed = false;
		// self events
		switch (state_) {
			case STATE_PLACE_SPACE_MARINES_SELECT_LOCATION:
				eventConsumed = STATE_PLACE_SPACE_MARINES_SELECT_LOCATION_selfEvent_(event, context);
				break;
			case STATE_PLACE_SPACE_MARINES_PLACED:
				eventConsumed = STATE_PLACE_SPACE_MARINES_PLACED_selfEvent_(event, context);
				break;
			case STATE_PLACE_SPACE_MARINES_PLACED_LAST:
				eventConsumed = STATE_PLACE_SPACE_MARINES_PLACED_LAST_selfEvent_(event, context);
				break;
			case STATE_SPACE_ARTIFACT_SELECT:
				eventConsumed = STATE_SPACE_ARTIFACT_SELECT_selfEvent_(event, context);
				break;
			case STATE_SPACE_ARTIFACT_SELECTED:
				eventConsumed = STATE_SPACE_ARTIFACT_SELECTED_selfEvent_(event, context);
				break;
			case STATE_SPACE_MARINE_SPACE_MARINE:
				eventConsumed = STATE_SPACE_MARINE_SPACE_MARINE_selfEvent_(event, context);
				break;
			case STATE_SPACE_MARINE_SELECTED:
				eventConsumed = STATE_SPACE_MARINE_SELECTED_selfEvent_(event, context);
				break;
			case STATE_SPACE_MARINE_MOVE_ACTIVATED:
				eventConsumed = STATE_SPACE_MARINE_MOVE_ACTIVATED_selfEvent_(event, context);
				break;
			case STATE_SPACE_MARINE_MOVE_FIRE_FIRING:
				eventConsumed = STATE_SPACE_MARINE_MOVE_FIRE_FIRING_selfEvent_(event, context);
				break;
			case STATE_SPACE_MARINE_MOVE_FIRE_DOUBLE_SHOT:
				eventConsumed = STATE_SPACE_MARINE_MOVE_FIRE_DOUBLE_SHOT_selfEvent_(event, context);
				break;
		} // end switch
		
		if (eventConsumed) return;
		
		// transitions
		switch (state_) {
			case STATE_STARTING:
				STATE_STARTING_transitions_(event, context);
				break;
			case STATE_PLACE_SPACE_MARINES_SELECT_LOCATION:
				STATE_PLACE_SPACE_MARINES_SELECT_LOCATION_transitions_(event, context);
				break;
			case STATE_PLACE_SPACE_MARINES_PLACED:
				STATE_PLACE_SPACE_MARINES_PLACED_transitions_(event, context);
				break;
			case STATE_PLACE_SPACE_MARINES_PLACED_LAST:
				STATE_PLACE_SPACE_MARINES_PLACED_LAST_transitions_(event, context);
				break;
			case STATE_PLACE_SPACE_MARINES_FINISHED:
				STATE_PLACE_SPACE_MARINES_FINISHED_transitions_(event, context);
				break;
			case STATE_SPACE_ARTIFACT_SELECT:
				STATE_SPACE_ARTIFACT_SELECT_transitions_(event, context);
				break;
			case STATE_SPACE_ARTIFACT_SELECTED:
				STATE_SPACE_ARTIFACT_SELECTED_transitions_(event, context);
				break;
			case STATE_START_FIRST_ROUND:
				STATE_START_FIRST_ROUND_transitions_(event, context);
				break;
			case STATE_SPACE_MARINE_SPACE_MARINE:
				STATE_SPACE_MARINE_SPACE_MARINE_transitions_(event, context);
				break;
			case STATE_SPACE_MARINE_SELECTED:
				STATE_SPACE_MARINE_SELECTED_transitions_(event, context);
				break;
			case STATE_SPACE_MARINE_MOVE_ACTIVATED:
				STATE_SPACE_MARINE_MOVE_ACTIVATED_transitions_(event, context);
				break;
			case STATE_SPACE_MARINE_MOVE_FIRE_FIRING:
				STATE_SPACE_MARINE_MOVE_FIRE_FIRING_transitions_(event, context);
				break;
			case STATE_SPACE_MARINE_MOVE_FIRE_DOUBLE_SHOT:
				STATE_SPACE_MARINE_MOVE_FIRE_DOUBLE_SHOT_transitions_(event, context);
				break;
			case STATE_SPACE_MARINE_MOVE_FIGHTING:
				STATE_SPACE_MARINE_MOVE_FIGHTING_transitions_(event, context);
				break;
			case STATE_STEALERS:
				STATE_STEALERS_transitions_(event, context);
				break;
			case STATE_GAME_ENDED:
				STATE_GAME_ENDED_transitions_(event, context);
				break;
		} // end switch
	}

	private void terminateDoActivity_() {
		if (runnable_ !=  null) {
			runnable_.stop();
			runnable_ = null;
		}
	}
	/**
	 * protected for the tests
	 */
	protected void exitState_(int event, int targetState, IContext context) {
		exitActions_(state_, targetState, context);
		fireStateExited_(this, event, context);
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
		fireStateEntered_(this, event, context);
	
		if (!doActivity_(state, context)) {
			if (!enterSubState_(event, context)) {
				fireCompletionEvent_(context);
			}
		}
	}

	private void fireCompletionEvent_(IContext context) {
		switch(state_) {
		case STATE_PLACE_SPACE_MARINES_FINISHED:
		case STATE_START_FIRST_ROUND:
			postEvent(EVENT_completion, context);
			break;
		}
	}
	
	private boolean enterSubState_(int event, IContext context) {
		switch (state_) {
			case STATE_PLACE_SPACE_MARINES: {
				enterState_(event, STATE_PLACE_SPACE_MARINES_SELECT_LOCATION, context);
				return true;
			}
			case STATE_SPACE_ARTIFACT: {
				enterState_(event, STATE_SPACE_ARTIFACT_SELECT, context);
				return true;
			}
			case STATE_SPACE_MARINE: {
				enterState_(event, STATE_SPACE_MARINE_SPACE_MARINE, context);
				return true;
			}
			case STATE_SPACE_MARINE_MOVE: {
				enterState_(event, STATE_SPACE_MARINE_MOVE_ACTIVATED, context);
				return true;
			}
			case STATE_SPACE_MARINE_MOVE_FIRE: {
				enterState_(event, STATE_SPACE_MARINE_MOVE_FIRE_FIRING, context);
				return true;
			}
		} // end switch
		return false;
	}

	private boolean doActivity_(int state, final IContext context) {
		switch (state) {
			case STATE_STEALERS: {
				runnable_ = new IRunnable() {
					public void run() {
						commands_.playSteallers(context);
						runnable_ = null;
						activityThread_ = null;
						fireCompletionEvent_(context);
					}
					public void stop() {
						commands_.stopPlaySteallers(context);
					}
				};
				doActivity_(runnable_);
				return true;
			}
		} // end switch
		return false;
	}

	protected void doActivity_(Runnable runnable) {
		activityThread_ = new Thread(runnable);
		activityThread_.start();
	}

	protected final void joinThreadActivity_() {
		if (activityThread_ != null) {
			try {
				activityThread_.join();
			} catch (InterruptedException e) {
			}
		}
	}
	
	private void exitActions_(int currentState, int targetState, IContext context) {		
		exitActionsUnit_(currentState, context);
		
		// execute exit actions of the parent states
		switch (currentState) {
		case STATE_PLACE_SPACE_MARINES_FINISHED:
			switch (targetState) {
			case STATE_SPACE_ARTIFACT:
			case STATE_START_FIRST_ROUND:
				exitActionsUnit_(STATE_PLACE_SPACE_MARINES, context);
				break;
			} // end switch targetState
			break;
		case STATE_SPACE_ARTIFACT_SELECTED:
			switch (targetState) {
			case STATE_START_FIRST_ROUND:
				exitActionsUnit_(STATE_SPACE_ARTIFACT, context);
				break;
			} // end switch targetState
			break;
		case STATE_SPACE_MARINE_SPACE_MARINE:
			switch (targetState) {
			case STATE_STEALERS:
				exitActionsUnit_(STATE_SPACE_MARINE, context);
				break;
			} // end switch targetState
			break;
		case STATE_SPACE_MARINE_SELECTED:
			switch (targetState) {
			case STATE_STEALERS:
				exitActionsUnit_(STATE_SPACE_MARINE, context);
				break;
			} // end switch targetState
			break;
		case STATE_SPACE_MARINE_MOVE_ACTIVATED:
			switch (targetState) {
			case STATE_SPACE_MARINE_SPACE_MARINE:
				exitActionsUnit_(STATE_SPACE_MARINE_MOVE, context);
				break;
			case STATE_GAME_ENDED:
				exitActionsUnit_(STATE_SPACE_MARINE_MOVE, context);
				exitActionsUnit_(STATE_SPACE_MARINE, context);
				break;
			} // end switch targetState
			break;
		case STATE_SPACE_MARINE_MOVE_FIRE_FIRING:
			switch (targetState) {
			case STATE_SPACE_MARINE_MOVE_ACTIVATED:
				exitActionsUnit_(STATE_SPACE_MARINE_MOVE_FIRE, context);
				break;
			case STATE_GAME_ENDED:
				exitActionsUnit_(STATE_SPACE_MARINE_MOVE_FIRE, context);
				exitActionsUnit_(STATE_SPACE_MARINE_MOVE, context);
				exitActionsUnit_(STATE_SPACE_MARINE, context);
				break;
			} // end switch targetState
			break;
		case STATE_SPACE_MARINE_MOVE_FIRE_DOUBLE_SHOT:
			switch (targetState) {
			case STATE_SPACE_MARINE_MOVE_ACTIVATED:
				exitActionsUnit_(STATE_SPACE_MARINE_MOVE_FIRE, context);
				break;
			case STATE_GAME_ENDED:
				exitActionsUnit_(STATE_SPACE_MARINE_MOVE_FIRE, context);
				exitActionsUnit_(STATE_SPACE_MARINE_MOVE, context);
				exitActionsUnit_(STATE_SPACE_MARINE, context);
				break;
			} // end switch targetState
			break;
		case STATE_SPACE_MARINE_MOVE_FIGHTING:
			switch (targetState) {
			case STATE_SPACE_MARINE_SPACE_MARINE:
				exitActionsUnit_(STATE_SPACE_MARINE_MOVE, context);
				break;
			case STATE_GAME_ENDED:
				exitActionsUnit_(STATE_SPACE_MARINE_MOVE, context);
				exitActionsUnit_(STATE_SPACE_MARINE, context);
				break;
			} // end switch targetState
			break;
		} // end switch currentState
	}

	/**
	 * for the tests
	 */
	protected void exitActionsUnit_(int currentState, IContext context) {
		switch (currentState) {
			case STATE_PLACE_SPACE_MARINES: {
				commands_.restoreDecors(context);
				commands_.clearMessageBar(context);
				break;
			}
			case STATE_PLACE_SPACE_MARINES_SELECT_LOCATION: {
				commands_.placeNewMarine(context);
				break;
			}
			case STATE_PLACE_SPACE_MARINES_PLACED: {
				commands_.spaceMarinedPlaced(context);
				break;
			}
			case STATE_PLACE_SPACE_MARINES_PLACED_LAST: {
				commands_.spaceMarinedPlaced(context);
				break;
			}
			case STATE_SPACE_ARTIFACT_SELECTED: {
				commands_.clearMessageBar(context);
				break;
			}
			case STATE_SPACE_MARINE_MOVE_FIRE: {
				commands_.endFiring(context);
				break;
			}
			case STATE_SPACE_MARINE_MOVE_FIRE_DOUBLE_SHOT: {
				commands_.exitDoubleShot(context);
				break;
			}
			case STATE_STEALERS: {
				commands_.endStealerRound(context);
				break;
			}
		}
	}

	private void entryActions_(IContext context) {
		switch (state_) {
			case STATE_PLACE_SPACE_MARINES: {
				commands_.placeSpaceMarinesController(context);
				break;
			}
			case STATE_SPACE_ARTIFACT_SELECT: {
				commands_.printNextArtifactMessage(context);
				break;
			}
			case STATE_SPACE_ARTIFACT_SELECTED: {
				commands_.selectMarine(context);
				break;
			}
			case STATE_START_FIRST_ROUND: {
				commands_.connectScenarioController(context);
				break;
			}
			case STATE_SPACE_MARINE: {
				commands_.initCommandementPoints(context);
				break;
			}
			case STATE_SPACE_MARINE_SELECTED: {
				commands_.selectMarine(context);
				break;
			}
			case STATE_SPACE_MARINE_MOVE_ACTIVATED: {
				commands_.clearMessageBar(context);
				break;
			}
			case STATE_SPACE_MARINE_MOVE_FIRE_FIRING: {
				commands_.beginFiring(context);
				break;
			}
			case STATE_SPACE_MARINE_MOVE_FIRE_DOUBLE_SHOT: {
				commands_.findStealersDoubleShot(context);
				break;
			}
			case STATE_SPACE_MARINE_MOVE_FIGHTING: {
				commands_.fight(context);
				break;
			}
			case STATE_STEALERS: {
				commands_.resetUndoAction(context);
				commands_.endSpaceMarineRound(context);
				break;
			}
			case STATE_GAME_ENDED: {
				commands_.enterEndOfGame(context);
				break;
			}
		}
	}
	
	protected abstract void fireStateExited_(IStateMachine stateMachine, int event, IContext context);

	protected abstract void fireStateEntered_(IStateMachine stateMachine, int event, IContext context);

	protected abstract void fireSelfEvent_(IStateMachine stateMachine, int event, IContext context);
}
