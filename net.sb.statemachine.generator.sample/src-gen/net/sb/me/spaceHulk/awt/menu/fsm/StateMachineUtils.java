/**
* This code is generated
*/
package net.sb.me.spaceHulk.awt.menu.fsm;

public final class StateMachineUtils {
	
	public static String eventToString(int event) {
		switch(event) {
			default:  return "";
			case IStateMachine.EVENT_newMissionEvt: return "newMissionEvt";
			case IStateMachine.EVENT_campaignManagerEvt: return "campaignManagerEvt";
			case IStateMachine.EVENT_saveManagerEvt: return "saveManagerEvt";
			case IStateMachine.EVENT_exitEvt: return "exitEvt";
			case IStateMachine.EVENT_closeEvt: return "closeEvt";
			case IStateMachine.EVENT_selectedEvt: return "selectedEvt";
			case IStateMachine.EVENT_endGameEvt: return "endGameEvt";
			case IStateMachine.EVENT_yesEvt: return "yesEvt";
			case IStateMachine.EVENT_noEvt: return "noEvt";
			case IStateMachine.EVENT_saveEvt: return "saveEvt";
			case IStateMachine.EVENT_quitEvt: return "quitEvt";
			case IStateMachine.EVENT_campaignEvt: return "campaignEvt";
			case IStateMachine.EVENT_missionEvt: return "missionEvt";
		}
	}
	
	public static int stringToEvent(String value) {
		if (value.equals("newMissionEvt")) return IStateMachine.EVENT_newMissionEvt;
		if (value.equals("campaignManagerEvt")) return IStateMachine.EVENT_campaignManagerEvt;
		if (value.equals("saveManagerEvt")) return IStateMachine.EVENT_saveManagerEvt;
		if (value.equals("exitEvt")) return IStateMachine.EVENT_exitEvt;
		if (value.equals("closeEvt")) return IStateMachine.EVENT_closeEvt;
		if (value.equals("selectedEvt")) return IStateMachine.EVENT_selectedEvt;
		if (value.equals("endGameEvt")) return IStateMachine.EVENT_endGameEvt;
		if (value.equals("yesEvt")) return IStateMachine.EVENT_yesEvt;
		if (value.equals("noEvt")) return IStateMachine.EVENT_noEvt;
		if (value.equals("saveEvt")) return IStateMachine.EVENT_saveEvt;
		if (value.equals("quitEvt")) return IStateMachine.EVENT_quitEvt;
		if (value.equals("campaignEvt")) return IStateMachine.EVENT_campaignEvt;
		if (value.equals("missionEvt")) return IStateMachine.EVENT_missionEvt;
		return -1;
	}
	
	public static String stateToString(int state) {
		switch(state) {
			default:  return "";
			case IStateMachine.STATE_mainMenu: return "STATE_mainMenu";
			case IStateMachine.STATE_mainMenu_mainMenuSelection: return "STATE_mainMenu_mainMenuSelection";
			case IStateMachine.STATE_mainMenu_quitGame: return "STATE_mainMenu_quitGame";
			case IStateMachine.STATE_missionSelectorPanel: return "STATE_missionSelectorPanel";
			case IStateMachine.STATE_campaignSelectorPanel: return "STATE_campaignSelectorPanel";
			case IStateMachine.STATE_saveManager: return "STATE_saveManager";
			case IStateMachine.STATE_campaignPanel: return "STATE_campaignPanel";
			case IStateMachine.STATE_campaignPanel_campaignDashboard: return "STATE_campaignPanel_campaignDashboard";
			case IStateMachine.STATE_campaignPanel_quitCampaign: return "STATE_campaignPanel_quitCampaign";
			case IStateMachine.STATE_campaignPanel_saveCampaign: return "STATE_campaignPanel_saveCampaign";
			case IStateMachine.STATE_playMission: return "STATE_playMission";
			case IStateMachine.STATE_playMission_playing: return "STATE_playMission_playing";
			case IStateMachine.STATE_playMission_quitMission: return "STATE_playMission_quitMission";
			case IStateMachine.STATE_playMission_saveMission: return "STATE_playMission_saveMission";
			case IStateMachine.STATE_playCampaign: return "STATE_playCampaign";
			case IStateMachine.STATE_playCampaign_playing: return "STATE_playCampaign_playing";
			case IStateMachine.STATE_playCampaign_quitMission: return "STATE_playCampaign_quitMission";
			case IStateMachine.STATE_playCampaign_saveMission: return "STATE_playCampaign_saveMission";
			case IStateMachine.STATE_exit: return "STATE_exit";
		}
	}

	public static int stringToState(String value) {
		if (value.equals("STATE_mainMenu")) return IStateMachine.STATE_mainMenu;
		if (value.equals("STATE_mainMenu_mainMenuSelection")) return IStateMachine.STATE_mainMenu_mainMenuSelection;
		if (value.equals("STATE_mainMenu_quitGame")) return IStateMachine.STATE_mainMenu_quitGame;
		if (value.equals("STATE_missionSelectorPanel")) return IStateMachine.STATE_missionSelectorPanel;
		if (value.equals("STATE_campaignSelectorPanel")) return IStateMachine.STATE_campaignSelectorPanel;
		if (value.equals("STATE_saveManager")) return IStateMachine.STATE_saveManager;
		if (value.equals("STATE_campaignPanel")) return IStateMachine.STATE_campaignPanel;
		if (value.equals("STATE_campaignPanel_campaignDashboard")) return IStateMachine.STATE_campaignPanel_campaignDashboard;
		if (value.equals("STATE_campaignPanel_quitCampaign")) return IStateMachine.STATE_campaignPanel_quitCampaign;
		if (value.equals("STATE_campaignPanel_saveCampaign")) return IStateMachine.STATE_campaignPanel_saveCampaign;
		if (value.equals("STATE_playMission")) return IStateMachine.STATE_playMission;
		if (value.equals("STATE_playMission_playing")) return IStateMachine.STATE_playMission_playing;
		if (value.equals("STATE_playMission_quitMission")) return IStateMachine.STATE_playMission_quitMission;
		if (value.equals("STATE_playMission_saveMission")) return IStateMachine.STATE_playMission_saveMission;
		if (value.equals("STATE_playCampaign")) return IStateMachine.STATE_playCampaign;
		if (value.equals("STATE_playCampaign_playing")) return IStateMachine.STATE_playCampaign_playing;
		if (value.equals("STATE_playCampaign_quitMission")) return IStateMachine.STATE_playCampaign_quitMission;
		if (value.equals("STATE_playCampaign_saveMission")) return IStateMachine.STATE_playCampaign_saveMission;
		if (value.equals("STATE_exit")) return IStateMachine.STATE_exit;
		return -1; 
	}
}
