/**
* This code is generated
*/
package net.sb.me.spaceHulk.awt.gamemanager.fsm;

public interface ICommands {
	void selectMarine(IContext context);
	void selectLocation(IContext context);
	void selectLocationAndValidate(IContext context);
	void activateMarine(IContext context);
	void validate(IContext context);
	void autoAction(IContext context);
	void moveSpaceMarine(IContext context);
	void dragScreen(IContext context);
}
