/**
* This code is generated
*/
package net.sb.me.spaceHulk.awt.menu.fsm;

public interface ICommands {
	void openMainMenu(IContext context);
	void openMissionSelector(IContext context);
	void closeContainer(IContext context);
	void openCampaignManager(IContext context);
	void openSaveManager(IContext context);
	void selectMission(IContext context);
	void selectCampaign(IContext context);
	void startMissionInCampaign(IContext context);
	void quitMissionQuestion(IContext context);
	void saveQuestion(IContext context);
	void saveMission(IContext context);
	void saveMissionCampaign(IContext context);
	void saveCampaign(IContext context);
	void quitCampaignQuestion(IContext context);
	void saveCampaignQuestion(IContext context);
	void quitGameQuestion(IContext context);
	void pauseGame(IContext context);
	void restartGame(IContext context);
	void exit(IContext context);
}
