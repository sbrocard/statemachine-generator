package net.sb.me.spaceHulk;

import net.sb.me.spaceHulk.fsm.ICommands;
import net.sb.me.spaceHulk.fsm.IContext;
import net.sb.me.spaceHulk.fsm.IGuards;
import net.sb.me.spaceHulk.fsm.IStateMachine;

public class Main {

	static final int nbToPlace = 5;
	static int placed = 0;

	
	public static void main(String[] args) {
		ICommands commands = new Commands();
		IGuards guards = new Guards();
		IStateMachine stateMachine = new StatemachineImpl(commands, guards);
		
		stateMachine.start();
		IContext context = null;
		stateMachine.postEvent(IStateMachine.EVENT_startGame, context);

		stateMachine.postEvent(IStateMachine.EVENT_VALIDATE, context);
		stateMachine.postEvent(IStateMachine.EVENT_LOCATION_SELECTED, context);
		stateMachine.postEvent(IStateMachine.EVENT_VALIDATE, context);
		stateMachine.postEvent(IStateMachine.EVENT_LOCATION_SELECTED, context);
		stateMachine.postEvent(IStateMachine.EVENT_VALIDATE, context);
		stateMachine.postEvent(IStateMachine.EVENT_LOCATION_SELECTED, context);
		stateMachine.postEvent(IStateMachine.EVENT_VALIDATE, context);
		stateMachine.postEvent(IStateMachine.EVENT_LOCATION_SELECTED, context);
		stateMachine.postEvent(IStateMachine.EVENT_VALIDATE, context);
		stateMachine.postEvent(IStateMachine.EVENT_LOCATION_SELECTED, context);
		
		// STATE_SPACE_MARINE_SPACE_MARINE
		stateMachine.postEvent(IStateMachine.EVENT_SELECT_SPACE_MARINE, context);
		stateMachine.postEvent(IStateMachine.EVENT_VALIDATE, context);

		// MOVE ACTIVATED
		stateMachine.postEvent(IStateMachine.EVENT_UP, context);
		stateMachine.postEvent(IStateMachine.EVENT_FIRE, context);
		// FIRE, FIRING
		stateMachine.postEvent(IStateMachine.EVENT_VALIDATE, context);
		stateMachine.postEvent(IStateMachine.EVENT_FIRED, context);
		
		// MOVE ACTIVATED
		stateMachine.postEvent(IStateMachine.EVENT_VALIDATE, context);
		
		stateMachine.postEvent(IStateMachine.EVENT_ENDSPACEMARINEROUND, context);
		
		// STEALERS
		
	}

}
