/**
* This code is generated
*/
package net.sb.me.spaceHulk.awt.gamemanager.fsm;

public interface IStateMachine {
	// Events
	public static int EVENT_completion = 0;
	public static int EVENT_click = 1;
	public static int EVENT_doubleClick = 2;
	public static int EVENT_dragged = 3;
	
	// States
	public static int NOT_STARTED = -1;
	public static int STATE_enter = 1;
	public static int STATE_selectMarine = 2;
	public static int STATE_noActivatedMarine = 3;
	public static int STATE_fire = 4;
	public static int STATE_moveActivated = 5;
	public static int STATE_nope = 6;


	void start();
	
	int getState();
	
	int getStartingState();
	
	/** Post an event that will be run asynchronously.<br>
	 * Context may be null
	 */
	void postEvent(int event, IContext context);
	
}
