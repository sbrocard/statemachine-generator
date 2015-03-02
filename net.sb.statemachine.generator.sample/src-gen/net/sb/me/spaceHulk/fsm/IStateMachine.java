/**
* This code is generated
*/
package net.sb.me.spaceHulk.fsm;

public interface IStateMachine {
	// Events
	public static int EVENT_completion = 0;
	public static int EVENT_startGame = 1;
	public static int EVENT_startFirstRound = 2;
	public static int EVENT_SELECT_SPACE_MARINE = 3;
	public static int EVENT_SPACE_MARINE_REMOVED = 4;
	public static int EVENT_LOCATION_SELECTED = 5;
	public static int EVENT_LEFT = 6;
	public static int EVENT_RIGHT = 7;
	public static int EVENT_UP = 8;
	public static int EVENT_DOWN = 9;
	public static int EVENT_UPRIGHT = 10;
	public static int EVENT_UPLEFT = 11;
	public static int EVENT_DOWNRIGHT = 12;
	public static int EVENT_DOWNLEFT = 13;
	public static int EVENT_ROTATERIGHT = 14;
	public static int EVENT_ROTATELEFT = 15;
	public static int EVENT_ACTIVATE = 16;
	public static int EVENT_VALIDATE = 17;
	public static int EVENT_CANCELED = 18;
	public static int EVENT_FIGHT = 19;
	public static int EVENT_FIRE = 20;
	public static int EVENT_FIRED = 21;
	public static int EVENT_ENDSPACEMARINEROUND = 22;
	public static int EVENT_SPACEMARINEDIES = 23;
	public static int EVENT_SPACEMARINEWINS = 24;
	public static int EVENT_EQUALITY = 25;
	public static int EVENT_END_PLAYING = 26;
	public static int EVENT_STOP_GAME = 27;
	public static int EVENT_CLEAR_JAM = 28;
	public static int EVENT_DROP_ARTIFACT = 29;
	public static int EVENT_TAKE_ARTIFACT = 30;
	public static int EVENT_OPEN_CLOSE_DOOR = 31;
	public static int EVENT_OVERWATCH = 32;
	public static int EVENT_CANCEL_OVERWATCH = 33;
	public static int EVENT_RELOAD = 34;
	
	// States
	public static int NOT_STARTED = -1;
	public static int STATE_STARTING = 1;
	public static int STATE_PLACE_SPACE_MARINES = 2;
	public static int STATE_PLACE_SPACE_MARINES_SELECT_LOCATION = 3;
	public static int STATE_PLACE_SPACE_MARINES_PLACED = 4;
	public static int STATE_PLACE_SPACE_MARINES_PLACED_LAST = 5;
	public static int STATE_PLACE_SPACE_MARINES_FINISHED = 6;
	public static int STATE_SPACE_ARTIFACT = 7;
	public static int STATE_SPACE_ARTIFACT_SELECT = 8;
	public static int STATE_SPACE_ARTIFACT_SELECTED = 9;
	public static int STATE_START_FIRST_ROUND = 10;
	public static int STATE_SPACE_MARINE = 11;
	public static int STATE_SPACE_MARINE_SPACE_MARINE = 12;
	public static int STATE_SPACE_MARINE_SELECTED = 13;
	public static int STATE_SPACE_MARINE_MOVE = 14;
	public static int STATE_SPACE_MARINE_MOVE_ACTIVATED = 15;
	public static int STATE_SPACE_MARINE_MOVE_FIRE = 16;
	public static int STATE_SPACE_MARINE_MOVE_FIRE_FIRING = 17;
	public static int STATE_SPACE_MARINE_MOVE_FIRE_DOUBLE_SHOT = 18;
	public static int STATE_SPACE_MARINE_MOVE_FIGHTING = 19;
	public static int STATE_STEALERS = 20;
	public static int STATE_GAME_ENDED = 21;
	public static int STATE_QUIT_GAME = 22;


	void start();
	
	int getState();
	
	int getStartingState();
	
	/** Post an event that will be run asynchronously.<br>
	 * Context may be null
	 */
	void postEvent(int event, IContext context);
	
	void addStateMachineListener(IStateMachineListener listener);
	void removeStateMachineListener(IStateMachineListener listener);
}
