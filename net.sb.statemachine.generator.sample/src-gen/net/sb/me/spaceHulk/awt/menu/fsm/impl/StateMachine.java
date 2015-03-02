/**
* This code is generated
*/
package net.sb.me.spaceHulk.awt.menu.fsm.impl;

import net.sb.me.spaceHulk.awt.menu.fsm.ICommands;
import net.sb.me.spaceHulk.awt.menu.fsm.IContext;
import net.sb.me.spaceHulk.awt.menu.fsm.IGuards;
import net.sb.me.spaceHulk.awt.menu.fsm.IStateMachine;
import net.sb.me.spaceHulk.awt.menu.fsm.StateMachineUtils;

public abstract class StateMachine implements IStateMachine {
	private int startingState_ = STATE_mainMenu;
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



	private void STATE_mainMenu_mainMenuSelection_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_campaignManagerEvt: {
				executeActionFreeTransition_(EVENT_campaignManagerEvt, STATE_campaignSelectorPanel, context);
				break;
			}
			case EVENT_closeEvt: {
				if(guards_.exitFeatureAvailable(context)) {
					executeActionFreeTransition_(EVENT_closeEvt, STATE_mainMenu_quitGame, context);
					break;
				}
				break;
			}
			case EVENT_exitEvt: {
				if(guards_.exitFeatureAvailable(context)) {
					executeActionFreeTransition_(EVENT_exitEvt, STATE_mainMenu_quitGame, context);
					break;
				}
				break;
			}
			case EVENT_newMissionEvt: {
				executeActionFreeTransition_(EVENT_newMissionEvt, STATE_missionSelectorPanel, context);
				break;
			}
			case EVENT_saveManagerEvt: {
				executeActionFreeTransition_(EVENT_saveManagerEvt, STATE_saveManager, context);
				break;
			}
			default:
				String error = "no transition on state STATE_mainMenu_mainMenuSelection, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}


	private void STATE_mainMenu_quitGame_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_noEvt: {
				executeActionFreeTransition_(EVENT_noEvt, STATE_mainMenu_mainMenuSelection, context);
				break;
			}
			case EVENT_yesEvt: {
				executeActionFreeTransition_(EVENT_yesEvt, STATE_exit, context);
				break;
			}
			default:
				String error = "no transition on state STATE_mainMenu_quitGame, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}


	private void STATE_missionSelectorPanel_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_closeEvt: {
				executeActionFreeTransition_(EVENT_closeEvt, STATE_mainMenu, context);
				break;
			}
			case EVENT_selectedEvt: {
				executeActionFreeTransition_(EVENT_selectedEvt, STATE_playMission, context);
				break;
			}
			default:
				String error = "no transition on state STATE_missionSelectorPanel, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}


	private void STATE_campaignSelectorPanel_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_closeEvt: {
				executeActionFreeTransition_(EVENT_closeEvt, STATE_mainMenu, context);
				break;
			}
			case EVENT_selectedEvt: {
				executeActionFreeTransition_(EVENT_selectedEvt, STATE_campaignPanel, context);
				break;
			}
			default:
				String error = "no transition on state STATE_campaignSelectorPanel, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}


	private void STATE_saveManager_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_campaignEvt: {
				executeActionFreeTransition_(EVENT_campaignEvt, STATE_campaignPanel, context);
				break;
			}
			case EVENT_closeEvt: {
				executeActionFreeTransition_(EVENT_closeEvt, STATE_mainMenu, context);
				break;
			}
			case EVENT_missionEvt: {
				executeActionFreeTransition_(EVENT_missionEvt, STATE_playMission, context);
				break;
			}
			default:
				String error = "no transition on state STATE_saveManager, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}




	private void STATE_campaignPanel_campaignDashboard_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_closeEvt: {
				executeActionFreeTransition_(EVENT_closeEvt, STATE_campaignPanel_quitCampaign, context);
				break;
			}
			case EVENT_selectedEvt: {
				executeActionFreeTransition_(EVENT_selectedEvt, STATE_playCampaign, context);
				break;
			}
			default:
				String error = "no transition on state STATE_campaignPanel_campaignDashboard, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}


	private void STATE_campaignPanel_quitCampaign_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_noEvt: {
				executeActionFreeTransition_(EVENT_noEvt, STATE_campaignPanel_campaignDashboard, context);
				break;
			}
			case EVENT_yesEvt: {
				executeActionFreeTransition_(EVENT_yesEvt, STATE_campaignPanel_saveCampaign, context);
				break;
			}
			default:
				String error = "no transition on state STATE_campaignPanel_quitCampaign, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}


	private void STATE_campaignPanel_saveCampaign_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_noEvt: {
				executeActionFreeTransition_(EVENT_noEvt, STATE_mainMenu, context);
				break;
			}
			case EVENT_yesEvt: {
				exitState_(EVENT_yesEvt, STATE_mainMenu, context); commands_.saveCampaign(context); enterState_(EVENT_yesEvt, STATE_mainMenu, context);
				break;
			}
			default:
				String error = "no transition on state STATE_campaignPanel_saveCampaign, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}




	private void STATE_playMission_playing_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_closeEvt: {
				executeActionFreeTransition_(EVENT_closeEvt, STATE_playMission_quitMission, context);
				break;
			}
			case EVENT_endGameEvt: {
				executeActionFreeTransition_(EVENT_endGameEvt, STATE_mainMenu, context);
				break;
			}
			default:
				String error = "no transition on state STATE_playMission_playing, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}


	private void STATE_playMission_quitMission_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_noEvt: {
				exitState_(EVENT_noEvt, STATE_playMission_playing, context); commands_.restartGame(context); enterState_(EVENT_noEvt, STATE_playMission_playing, context);
				break;
			}
			case EVENT_yesEvt: {
				executeActionFreeTransition_(EVENT_yesEvt, STATE_playMission_saveMission, context);
				break;
			}
			default:
				String error = "no transition on state STATE_playMission_quitMission, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}


	private void STATE_playMission_saveMission_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_noEvt: {
				executeActionFreeTransition_(EVENT_noEvt, STATE_mainMenu, context);
				break;
			}
			case EVENT_yesEvt: {
				exitState_(EVENT_yesEvt, STATE_mainMenu, context); commands_.saveMission(context); enterState_(EVENT_yesEvt, STATE_mainMenu, context);
				break;
			}
			default:
				String error = "no transition on state STATE_playMission_saveMission, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}




	private void STATE_playCampaign_playing_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_closeEvt: {
				executeActionFreeTransition_(EVENT_closeEvt, STATE_playCampaign_quitMission, context);
				break;
			}
			case EVENT_endGameEvt: {
				executeActionFreeTransition_(EVENT_endGameEvt, STATE_campaignPanel, context);
				break;
			}
			default:
				String error = "no transition on state STATE_playCampaign_playing, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}


	private void STATE_playCampaign_quitMission_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_noEvt: {
				exitState_(EVENT_noEvt, STATE_playCampaign_playing, context); commands_.restartGame(context); enterState_(EVENT_noEvt, STATE_playCampaign_playing, context);
				break;
			}
			case EVENT_yesEvt: {
				executeActionFreeTransition_(EVENT_yesEvt, STATE_playCampaign_saveMission, context);
				break;
			}
			default:
				String error = "no transition on state STATE_playCampaign_quitMission, event " + 
					StateMachineUtils.eventToString(event);
				if(generateException_) {
					throw new RuntimeException(error);
				} else {
					System.out.println(error);
				}
		}
	}


	private void STATE_playCampaign_saveMission_transitions_(int event, IContext context) {
		switch (event) {
			case EVENT_noEvt: {
				executeActionFreeTransition_(EVENT_noEvt, STATE_campaignPanel, context);
				break;
			}
			case EVENT_yesEvt: {
				exitState_(EVENT_yesEvt, STATE_campaignPanel, context); commands_.saveMissionCampaign(context); enterState_(EVENT_yesEvt, STATE_campaignPanel, context);
				break;
			}
			default:
				String error = "no transition on state STATE_playCampaign_saveMission, event " + 
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
		} // end switch
		
		if (eventConsumed) return;
		
		// transitions
		switch (state_) {
			case STATE_mainMenu_mainMenuSelection:
				STATE_mainMenu_mainMenuSelection_transitions_(event, context);
				break;
			case STATE_mainMenu_quitGame:
				STATE_mainMenu_quitGame_transitions_(event, context);
				break;
			case STATE_missionSelectorPanel:
				STATE_missionSelectorPanel_transitions_(event, context);
				break;
			case STATE_campaignSelectorPanel:
				STATE_campaignSelectorPanel_transitions_(event, context);
				break;
			case STATE_saveManager:
				STATE_saveManager_transitions_(event, context);
				break;
			case STATE_campaignPanel_campaignDashboard:
				STATE_campaignPanel_campaignDashboard_transitions_(event, context);
				break;
			case STATE_campaignPanel_quitCampaign:
				STATE_campaignPanel_quitCampaign_transitions_(event, context);
				break;
			case STATE_campaignPanel_saveCampaign:
				STATE_campaignPanel_saveCampaign_transitions_(event, context);
				break;
			case STATE_playMission_playing:
				STATE_playMission_playing_transitions_(event, context);
				break;
			case STATE_playMission_quitMission:
				STATE_playMission_quitMission_transitions_(event, context);
				break;
			case STATE_playMission_saveMission:
				STATE_playMission_saveMission_transitions_(event, context);
				break;
			case STATE_playCampaign_playing:
				STATE_playCampaign_playing_transitions_(event, context);
				break;
			case STATE_playCampaign_quitMission:
				STATE_playCampaign_quitMission_transitions_(event, context);
				break;
			case STATE_playCampaign_saveMission:
				STATE_playCampaign_saveMission_transitions_(event, context);
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
	}
	
	private boolean enterSubState_(int event, IContext context) {
		switch (state_) {
			case STATE_mainMenu: {
				enterState_(event, STATE_mainMenu_mainMenuSelection, context);
				return true;
			}
			case STATE_campaignPanel: {
				enterState_(event, STATE_campaignPanel_campaignDashboard, context);
				return true;
			}
			case STATE_playMission: {
				enterState_(event, STATE_playMission_playing, context);
				return true;
			}
			case STATE_playCampaign: {
				enterState_(event, STATE_playCampaign_playing, context);
				return true;
			}
		} // end switch
		return false;
	}

	
	private void exitActions_(int currentState, int targetState, IContext context) {		
		exitActionsUnit_(currentState, context);
		
		// execute exit actions of the parent states
		switch (currentState) {
		case STATE_mainMenu_mainMenuSelection:
			switch (targetState) {
			case STATE_missionSelectorPanel:
			case STATE_campaignSelectorPanel:
			case STATE_saveManager:
				exitActionsUnit_(STATE_mainMenu, context);
				break;
			} // end switch targetState
			break;
		case STATE_mainMenu_quitGame:
			switch (targetState) {
			case STATE_exit:
				exitActionsUnit_(STATE_mainMenu, context);
				break;
			} // end switch targetState
			break;
		case STATE_campaignPanel_campaignDashboard:
			switch (targetState) {
			case STATE_playCampaign:
				exitActionsUnit_(STATE_campaignPanel, context);
				break;
			} // end switch targetState
			break;
		case STATE_campaignPanel_saveCampaign:
			switch (targetState) {
			case STATE_mainMenu:
				exitActionsUnit_(STATE_campaignPanel, context);
				break;
			} // end switch targetState
			break;
		case STATE_playMission_playing:
			switch (targetState) {
			case STATE_mainMenu:
				exitActionsUnit_(STATE_playMission, context);
				break;
			} // end switch targetState
			break;
		case STATE_playMission_saveMission:
			switch (targetState) {
			case STATE_mainMenu:
				exitActionsUnit_(STATE_playMission, context);
				break;
			} // end switch targetState
			break;
		case STATE_playCampaign_playing:
			switch (targetState) {
			case STATE_campaignPanel:
				exitActionsUnit_(STATE_playCampaign, context);
				break;
			} // end switch targetState
			break;
		case STATE_playCampaign_saveMission:
			switch (targetState) {
			case STATE_campaignPanel:
				exitActionsUnit_(STATE_playCampaign, context);
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
			case STATE_missionSelectorPanel: {
				commands_.closeContainer(context);
				break;
			}
			case STATE_campaignSelectorPanel: {
				commands_.closeContainer(context);
				break;
			}
			case STATE_saveManager: {
				commands_.closeContainer(context);
				break;
			}
			case STATE_campaignPanel: {
				commands_.closeContainer(context);
				break;
			}
			case STATE_playMission: {
				commands_.closeContainer(context);
				break;
			}
			case STATE_playCampaign: {
				commands_.closeContainer(context);
				break;
			}
		}
	}

	private void entryActions_(IContext context) {
		switch (state_) {
			case STATE_mainMenu: {
				commands_.openMainMenu(context);
				break;
			}
			case STATE_mainMenu_quitGame: {
				commands_.quitGameQuestion(context);
				break;
			}
			case STATE_missionSelectorPanel: {
				commands_.openMissionSelector(context);
				break;
			}
			case STATE_campaignSelectorPanel: {
				commands_.openCampaignManager(context);
				break;
			}
			case STATE_saveManager: {
				commands_.openSaveManager(context);
				break;
			}
			case STATE_campaignPanel: {
				commands_.selectCampaign(context);
				break;
			}
			case STATE_campaignPanel_quitCampaign: {
				commands_.quitCampaignQuestion(context);
				break;
			}
			case STATE_campaignPanel_saveCampaign: {
				commands_.saveCampaignQuestion(context);
				break;
			}
			case STATE_playMission: {
				commands_.selectMission(context);
				break;
			}
			case STATE_playMission_quitMission: {
				commands_.pauseGame(context);
				commands_.quitMissionQuestion(context);
				break;
			}
			case STATE_playMission_saveMission: {
				commands_.saveQuestion(context);
				break;
			}
			case STATE_playCampaign: {
				commands_.startMissionInCampaign(context);
				break;
			}
			case STATE_playCampaign_quitMission: {
				commands_.pauseGame(context);
				commands_.quitMissionQuestion(context);
				break;
			}
			case STATE_playCampaign_saveMission: {
				commands_.saveQuestion(context);
				break;
			}
			case STATE_exit: {
				commands_.exit(context);
				break;
			}
		}
	}
	
}
