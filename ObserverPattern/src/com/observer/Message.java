package com.observer;

public class Message {
	String messageContent = "";

	public Message(String m) {
		this.messageContent = m;
	}

	public String getMessageContent() {
		return messageContent;
	}
}