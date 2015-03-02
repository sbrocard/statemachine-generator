package net.sb.statemachine.generator.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.sb.statemachine.dsl.stm.State;

public class States2ExitActions {
	private Collection<State> states_ = new ArrayList<State>();
	private List<State> exitedStates_ = new ArrayList<State>();
	
	public void addState(State state) {
		states_.add(state);
	}
	
	public void addExitedStates(State state) {
		exitedStates_.add(state);
	}

	public Collection<State> getStates() {
		return states_;
	}

	public List<State> getExitedStates() {
		return exitedStates_;
	}
}