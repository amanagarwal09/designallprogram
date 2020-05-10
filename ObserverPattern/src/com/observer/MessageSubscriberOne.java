package com.observer;

public class MessageSubscriberOne implements Observer {
	@Override
	public void update(Message m) {
		System.out.println("1st Subscriber : " + m.getMessageContent());
	}
}