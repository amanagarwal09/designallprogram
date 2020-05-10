package com.observer;
public class MessageSubscriberTwo implements Observer 
{
	
    @Override
    public void update(Message m) {
        System.out.println("2nd Subscriber : " + m.getMessageContent());
    }
}