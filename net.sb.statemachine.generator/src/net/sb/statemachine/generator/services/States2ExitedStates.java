package net.sb.statemachine.generator.services;

import java.util.ArrayList;
import java.util.Collection;

import net.sb.statemachine.dsl.stm.State;

public class States2ExitedStates {
	
	public State originState_;
	
	/**
	 * Target state to the list of exited parent states. Does not the originState_;
	 */
	public Collection<States2ExitActions> exitedStates_ = new ArrayList<States2ExitActions>();

	public States2ExitedStates(State state) {
		originState_ = state;
	}

	public State getOriginState() {
		return originState_;
	}
	
	public Collection<States2ExitActions> getExitedStates() {
		return exitedStates_;
	}
	
}
