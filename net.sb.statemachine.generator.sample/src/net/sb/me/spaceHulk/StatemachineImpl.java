package net.sb.me.spaceHulk;

import net.sb.me.spaceHulk.fsm.ICommands;
import net.sb.me.spaceHulk.fsm.IContext;
import net.sb.me.spaceHulk.fsm.IGuards;
import net.sb.me.spaceHulk.fsm.IStateMachine;
import net.sb.me.spaceHulk.fsm.IStateMachineListener;
import net.sb.me.spaceHulk.fsm.impl.StateMachine;

final class StatemachineImpl extends StateMachine {
	StatemachineImpl(ICommands commands, IGuards guards) {
		super(commands, guards);
	}

	@Override
	public void addStateMachineListener(IStateMachineListener listener) {
	}

	@Override
	public void removeStateMachineListener(
			IStateMachineListener listener) {
	}

	@Override
	protected void processEvent_(int event, IContext context) {
		processEventImpl_(event, context);
	}

	@Override
	protected void fireStateExited_(IStateMachine stateMachine,
			int event, IContext context) {
	}

	@Override
	protected void fireStateEntered_(IStateMachine stateMachine,
			int event, IContext context) {
	}

	@Override
	protected void fireSelfEvent_(IStateMachine stateMachine,
			int event, IContext context) {
		
	}
}