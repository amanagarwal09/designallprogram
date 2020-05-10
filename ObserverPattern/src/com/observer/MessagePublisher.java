package com.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher extends Subject {

	private List<Observer> observers = new ArrayList<>();

	public void attach(Observer o) {
		observers.add(o);
	}

	public void detach(Observer o) {
		observers.remove(o);
	}

	public void notifyUpdate(Message m) {
		for (Observer o : observers) {
			o.update(m);
		}
	}

	public void changeState(State s) {
		this.notifyUpdate(new Message("The state is changed to " + s.getChangeState()));
	}

}