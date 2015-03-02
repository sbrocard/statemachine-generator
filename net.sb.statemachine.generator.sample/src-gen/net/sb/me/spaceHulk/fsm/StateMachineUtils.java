/**
* This code is generated
*/
package net.sb.me.spaceHulk.fsm;

public final class StateMachineUtils {
	
	public static String eventToString(int event) {
		switch(event) {
			default:  return "";
			case IStateMachine.EVENT_completion: return "completion";
			case IStateMachine.EVENT_startGame: return "startGame";
			case IStateMachine.EVENT_startFirstRound: return "startFirstRound";
			case IStateMachine.EVENT_SELECT_SPACE_MARINE: return "SELECT_SPACE_MARINE";
			case IStateMachine.EVENT_SPACE_MARINE_REMOVED: return "SPACE_MARINE_REMOVED";
			case IStateMachine.EVENT_LOCATION_SELECTED: return "LOCATION_SELECTED";
			case IStateMachine.EVENT_LEFT: return "LEFT";
			case IStateMachine.EVENT_RIGHT: return "RIGHT";
			case IStateMachine.EVENT_UP: return "UP";
			case IStateMachine.EVENT_DOWN: return "DOWN";
			case IStateMachine.EVENT_UPRIGHT: return "UPRIGHT";
			case IStateMachine.EVENT_UPLEFT: return "UPLEFT";
			case IStateMachine.EVENT_DOWNRIGHT: return "DOWNRIGHT";
			case IStateMachine.EVENT_DOWNLEFT: return "DOWNLEFT";
			case IStateMachine.EVENT_ROTATERIGHT: return "ROTATERIGHT";
			case IStateMachine.EVENT_ROTATELEFT: return "ROTATELEFT";
			case IStateMachine.EVENT_ACTIVATE: return "ACTIVATE";
			case IStateMachine.EVENT_VALIDATE: return "VALIDATE";
			case IStateMachine.EVENT_CANCELED: return "CANCELED";
			case IStateMachine.EVENT_FIGHT: return "FIGHT";
			case IStateMachine.EVENT_FIRE: return "FIRE";
			case IStateMachine.EVENT_FIRED: return "FIRED";
			case IStateMachine.EVENT_ENDSPACEMARINEROUND: return "ENDSPACEMARINEROUND";
			case IStateMachine.EVENT_SPACEMARINEDIES: return "SPACEMARINEDIES";
			case IStateMachine.EVENT_SPACEMARINEWINS: return "SPACEMARINEWINS";
			case IStateMachine.EVENT_EQUALITY: return "EQUALITY";
			case IStateMachine.EVENT_END_PLAYING: return "END_PLAYING";
			case IStateMachine.EVENT_STOP_GAME: return "STOP_GAME";
			case IStateMachine.EVENT_CLEAR_JAM: return "CLEAR_JAM";
			case IStateMachine.EVENT_DROP_ARTIFACT: return "DROP_ARTIFACT";
			case IStateMachine.EVENT_TAKE_ARTIFACT: return "TAKE_ARTIFACT";
			case IStateMachine.EVENT_OPEN_CLOSE_DOOR: return "OPEN_CLOSE_DOOR";
			case IStateMachine.EVENT_OVERWATCH: return "OVERWATCH";
			case IStateMachine.EVENT_CANCEL_OVERWATCH: return "CANCEL_OVERWATCH";
			case IStateMachine.EVENT_RELOAD: return "RELOAD";
		}
	}
	
	public static int stringToEvent(String value) {
		if (value.equals("completion")) return IStateMachine.EVENT_completion;
		if (value.equals("startGame")) return IStateMachine.EVENT_startGame;
		if (value.equals("startFirstRound")) return IStateMachine.EVENT_startFirstRound;
		if (value.equals("SELECT_SPACE_MARINE")) return IStateMachine.EVENT_SELECT_SPACE_MARINE;
		if (value.equals("SPACE_MARINE_REMOVED")) return IStateMachine.EVENT_SPACE_MARINE_REMOVED;
		if (value.equals("LOCATION_SELECTED")) return IStateMachine.EVENT_LOCATION_SELECTED;
		if (value.equals("LEFT")) return IStateMachine.EVENT_LEFT;
		if (value.equals("RIGHT")) return IStateMachine.EVENT_RIGHT;
		if (value.equals("UP")) return IStateMachine.EVENT_UP;
		if (value.equals("DOWN")) return IStateMachine.EVENT_DOWN;
		if (value.equals("UPRIGHT")) return IStateMachine.EVENT_UPRIGHT;
		if (value.equals("UPLEFT")) return IStateMachine.EVENT_UPLEFT;
		if (value.equals("DOWNRIGHT")) return IStateMachine.EVENT_DOWNRIGHT;
		if (value.equals("DOWNLEFT")) return IStateMachine.EVENT_DOWNLEFT;
		if (value.equals("ROTATERIGHT")) return IStateMachine.EVENT_ROTATERIGHT;
		if (value.equals("ROTATELEFT")) return IStateMachine.EVENT_ROTATELEFT;
		if (value.equals("ACTIVATE")) return IStateMachine.EVENT_ACTIVATE;
		if (value.equals("VALIDATE")) return IStateMachine.EVENT_VALIDATE;
		if (value.equals("CANCELED")) return IStateMachine.EVENT_CANCELED;
		if (value.equals("FIGHT")) return IStateMachine.EVENT_FIGHT;
		if (value.equals("FIRE")) return IStateMachine.EVENT_FIRE;
		if (value.equals("FIRED")) return IStateMachine.EVENT_FIRED;
		if (value.equals("ENDSPACEMARINEROUND")) return IStateMachine.EVENT_ENDSPACEMARINEROUND;
		if (value.equals("SPACEMARINEDIES")) return IStateMachine.EVENT_SPACEMARINEDIES;
		if (value.equals("SPACEMARINEWINS")) return IStateMachine.EVENT_SPACEMARINEWINS;
		if (value.equals("EQUALITY")) return IStateMachine.EVENT_EQUALITY;
		if (value.equals("END_PLAYING")) return IStateMachine.EVENT_END_PLAYING;
		if (value.equals("STOP_GAME")) return IStateMachine.EVENT_STOP_GAME;
		if (value.equals("CLEAR_JAM")) return IStateMachine.EVENT_CLEAR_JAM;
		if (value.equals("DROP_ARTIFACT")) return IStateMachine.EVENT_DROP_ARTIFACT;
		if (value.equals("TAKE_ARTIFACT")) return IStateMachine.EVENT_TAKE_ARTIFACT;
		if (value.equals("OPEN_CLOSE_DOOR")) return IStateMachine.EVENT_OPEN_CLOSE_DOOR;
		if (value.equals("OVERWATCH")) return IStateMachine.EVENT_OVERWATCH;
		if (value.equals("CANCEL_OVERWATCH")) return IStateMachine.EVENT_CANCEL_OVERWATCH;
		if (value.equals("RELOAD")) return IStateMachine.EVENT_RELOAD;
		return -1;
	}
	
	public static String stateToString(int state) {
		switch(state) {
			default:  return "";
			case IStateMachine.STATE_STARTING: return "STATE_STARTING";
			case IStateMachine.STATE_PLACE_SPACE_MARINES: return "STATE_PLACE_SPACE_MARINES";
			case IStateMachine.STATE_PLACE_SPACE_MARINES_SELECT_LOCATION: return "STATE_PLACE_SPACE_MARINES_SELECT_LOCATION";
			case IStateMachine.STATE_PLACE_SPACE_MARINES_PLACED: return "STATE_PLACE_SPACE_MARINES_PLACED";
			case IStateMachine.STATE_PLACE_SPACE_MARINES_PLACED_LAST: return "STATE_PLACE_SPACE_MARINES_PLACED_LAST";
			case IStateMachine.STATE_PLACE_SPACE_MARINES_FINISHED: return "STATE_PLACE_SPACE_MARINES_FINISHED";
			case IStateMachine.STATE_SPACE_ARTIFACT: return "STATE_SPACE_ARTIFACT";
			case IStateMachine.STATE_SPACE_ARTIFACT_SELECT: return "STATE_SPACE_ARTIFACT_SELECT";
			case IStateMachine.STATE_SPACE_ARTIFACT_SELECTED: return "STATE_SPACE_ARTIFACT_SELECTED";
			case IStateMachine.STATE_START_FIRST_ROUND: return "STATE_START_FIRST_ROUND";
			case IStateMachine.STATE_SPACE_MARINE: return "STATE_SPACE_MARINE";
			case IStateMachine.STATE_SPACE_MARINE_SPACE_MARINE: return "STATE_SPACE_MARINE_SPACE_MARINE";
			case IStateMachine.STATE_SPACE_MARINE_SELECTED: return "STATE_SPACE_MARINE_SELECTED";
			case IStateMachine.STATE_SPACE_MARINE_MOVE: return "STATE_SPACE_MARINE_MOVE";
			case IStateMachine.STATE_SPACE_MARINE_MOVE_ACTIVATED: return "STATE_SPACE_MARINE_MOVE_ACTIVATED";
			case IStateMachine.STATE_SPACE_MARINE_MOVE_FIRE: return "STATE_SPACE_MARINE_MOVE_FIRE";
			case IStateMachine.STATE_SPACE_MARINE_MOVE_FIRE_FIRING: return "STATE_SPACE_MARINE_MOVE_FIRE_FIRING";
			case IStateMachine.STATE_SPACE_MARINE_MOVE_FIRE_DOUBLE_SHOT: return "STATE_SPACE_MARINE_MOVE_FIRE_DOUBLE_SHOT";
			case IStateMachine.STATE_SPACE_MARINE_MOVE_FIGHTING: return "STATE_SPACE_MARINE_MOVE_FIGHTING";
			case IStateMachine.STATE_STEALERS: return "STATE_STEALERS";
			case IStateMachine.STATE_GAME_ENDED: return "STATE_GAME_ENDED";
			case IStateMachine.STATE_QUIT_GAME: return "STATE_QUIT_GAME";
		}
	}

	public static int stringToState(String value) {
		if (value.equals("STATE_STARTING")) return IStateMachine.STATE_STARTING;
		if (value.equals("STATE_PLACE_SPACE_MARINES")) return IStateMachine.STATE_PLACE_SPACE_MARINES;
		if (value.equals("STATE_PLACE_SPACE_MARINES_SELECT_LOCATION")) return IStateMachine.STATE_PLACE_SPACE_MARINES_SELECT_LOCATION;
		if (value.equals("STATE_PLACE_SPACE_MARINES_PLACED")) return IStateMachine.STATE_PLACE_SPACE_MARINES_PLACED;
		if (value.equals("STATE_PLACE_SPACE_MARINES_PLACED_LAST")) return IStateMachine.STATE_PLACE_SPACE_MARINES_PLACED_LAST;
		if (value.equals("STATE_PLACE_SPACE_MARINES_FINISHED")) return IStateMachine.STATE_PLACE_SPACE_MARINES_FINISHED;
		if (value.equals("STATE_SPACE_ARTIFACT")) return IStateMachine.STATE_SPACE_ARTIFACT;
		if (value.equals("STATE_SPACE_ARTIFACT_SELECT")) return IStateMachine.STATE_SPACE_ARTIFACT_SELECT;
		if (value.equals("STATE_SPACE_ARTIFACT_SELECTED")) return IStateMachine.STATE_SPACE_ARTIFACT_SELECTED;
		if (value.equals("STATE_START_FIRST_ROUND")) return IStateMachine.STATE_START_FIRST_ROUND;
		if (value.equals("STATE_SPACE_MARINE")) return IStateMachine.STATE_SPACE_MARINE;
		if (value.equals("STATE_SPACE_MARINE_SPACE_MARINE")) return IStateMachine.STATE_SPACE_MARINE_SPACE_MARINE;
		if (value.equals("STATE_SPACE_MARINE_SELECTED")) return IStateMachine.STATE_SPACE_MARINE_SELECTED;
		if (value.equals("STATE_SPACE_MARINE_MOVE")) return IStateMachine.STATE_SPACE_MARINE_MOVE;
		if (value.equals("STATE_SPACE_MARINE_MOVE_ACTIVATED")) return IStateMachine.STATE_SPACE_MARINE_MOVE_ACTIVATED;
		if (value.equals("STATE_SPACE_MARINE_MOVE_FIRE")) return IStateMachine.STATE_SPACE_MARINE_MOVE_FIRE;
		if (value.equals("STATE_SPACE_MARINE_MOVE_FIRE_FIRING")) return IStateMachine.STATE_SPACE_MARINE_MOVE_FIRE_FIRING;
		if (value.equals("STATE_SPACE_MARINE_MOVE_FIRE_DOUBLE_SHOT")) return IStateMachine.STATE_SPACE_MARINE_MOVE_FIRE_DOUBLE_SHOT;
		if (value.equals("STATE_SPACE_MARINE_MOVE_FIGHTING")) return IStateMachine.STATE_SPACE_MARINE_MOVE_FIGHTING;
		if (value.equals("STATE_STEALERS")) return IStateMachine.STATE_STEALERS;
		if (value.equals("STATE_GAME_ENDED")) return IStateMachine.STATE_GAME_ENDED;
		if (value.equals("STATE_QUIT_GAME")) return IStateMachine.STATE_QUIT_GAME;
		return -1; 
	}
}
