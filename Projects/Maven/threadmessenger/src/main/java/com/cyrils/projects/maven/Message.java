package com.cyrils.projects.maven;

import java.time.LocalDateTime;

public class Message {
    //TODO: Implement a thread-safe message counter
    //? This is a static variable, so it is shared among all instances of this class.
    //?Therefore not thread safe.
    private static int messageCounter = 0;

    public enum MessageType {
        DATA, WARNING, ERROR, COMMAND
    }
    //message attributes - final for immutability
    private final MessageType type;
    private final String payload; //carry actual message
    private final String sender; 
    private final String receiver; 
    private final String timestamp; //time of sending message
    private final int messageID; //unique message ID
    private final int priority; //message priority


    //constructor for Jackson
    public Message() {
        this.type = null;
        this.payload = null;
        this.sender = null;
        this.receiver = null;
        this.timestamp = null;
        this.messageID = 0;
        this.priority = 0;
    }
    //message constructor
    public Message(MessageType type, String payload, String sender, String receiver) {
        this.type = type;
        this.payload = payload;
        this.sender = sender;
        this.receiver = receiver;
        this.timestamp = LocalDateTime.now().toString();
        this.messageID = messageCounter++;
        this.priority = 0;
    }
    //to string method
    @Override
    public String toString() {
        return "Message ID: " + messageID + "\n" + "Type: " + type + "\n" + "Payload: " + payload + "\n" + "Sender: " + sender + "\n" + "Receiver: " + receiver + "\n" + "Timestamp: " + timestamp + "\n";
    }
    //getters 
    public MessageType getType() {
        return type;
    }
    public String getPayload() {
        return payload;
    }
    public String getSender() {
        return sender;
    }
    public String getReceiver() {
        return receiver;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public int getMessageID() {
        return messageID;
    }
    public int getPriority() {
        return priority;
    }
    //no setters - immutable class
}
