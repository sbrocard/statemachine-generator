/**
* This code is generated
*/
package net.sb.me.spaceHulk.fsm;


public interface IStateMachineListener {
	void onSelfEvent(IStateMachine stateMachine, int event, IContext context);
	void onStateExited(IStateMachine stateMachine, int event, IContext context);
	void onStateEntered(IStateMachine stateMachine, int event, IContext context);
}
