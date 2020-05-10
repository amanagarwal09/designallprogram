package com.observer;

public class Main {
	public static void main(String[] args) {
		MessageSubscriberOne s1 = new MessageSubscriberOne();
		MessageSubscriberTwo s2 = new MessageSubscriberTwo();
		MessageSubscriberThree s3 = new MessageSubscriberThree();
		State s = new State("HIGH_PRIOPRITY");
		MessagePublisher p = new MessagePublisher();
		p.attach(s1);
		p.attach(s2);
		p.changeState(s);
		s.setChangeState("LOW_PRIORITY");
		p.detach(s1);
		p.attach(s1);
		p.attach(s3);
		p.changeState(s);
	}
}