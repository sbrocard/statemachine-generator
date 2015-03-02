/**
* This code is generated
*/
package net.sb.me.spaceHulk.awt.menu.fsm;

public interface IStateMachine {
	// Events
	public static int EVENT_newMissionEvt = 0;
	public static int EVENT_campaignManagerEvt = 1;
	public static int EVENT_saveManagerEvt = 2;
	public static int EVENT_exitEvt = 3;
	public static int EVENT_closeEvt = 4;
	public static int EVENT_selectedEvt = 5;
	public static int EVENT_endGameEvt = 6;
	public static int EVENT_yesEvt = 7;
	public static int EVENT_noEvt = 8;
	public static int EVENT_saveEvt = 9;
	public static int EVENT_quitEvt = 10;
	public static int EVENT_campaignEvt = 11;
	public static int EVENT_missionEvt = 12;
	
	// States
	public static int NOT_STARTED = -1;
	public static int STATE_mainMenu = 1;
	public static int STATE_mainMenu_mainMenuSelection = 2;
	public static int STATE_mainMenu_quitGame = 3;
	public static int STATE_missionSelectorPanel = 4;
	public static int STATE_campaignSelectorPanel = 5;
	public static int STATE_saveManager = 6;
	public static int STATE_campaignPanel = 7;
	public static int STATE_campaignPanel_campaignDashboard = 8;
	public static int STATE_campaignPanel_quitCampaign = 9;
	public static int STATE_campaignPanel_saveCampaign = 10;
	public static int STATE_playMission = 11;
	public static int STATE_playMission_playing = 12;
	public static int STATE_playMission_quitMission = 13;
	public static int STATE_playMission_saveMission = 14;
	public static int STATE_playCampaign = 15;
	public static int STATE_playCampaign_playing = 16;
	public static int STATE_playCampaign_quitMission = 17;
	public static int STATE_playCampaign_saveMission = 18;
	public static int STATE_exit = 19;


	void start();
	
	int getState();
	
	int getStartingState();
	
	/** Post an event that will be run asynchronously.<br>
	 * Context may be null
	 */
	void postEvent(int event, IContext context);
	
}
