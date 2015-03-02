package net.sb.statemachine.generator.services;

import java.util.Comparator;

import net.sb.statemachine.dsl.stm.Event;

public class EventComparator implements Comparator<Event> {

	@Override
	public int compare(Event arg0, Event arg1) {
		return arg0.getName().compareTo(arg1.getName());
	}

}
