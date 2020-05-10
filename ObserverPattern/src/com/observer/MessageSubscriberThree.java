package com.observer;
public class MessageSubscriberThree implements Observer 
{
	
    @Override
    public void update(Message m) {
        System.out.println("3rd Subscriber : " + m.getMessageContent());
    }
}