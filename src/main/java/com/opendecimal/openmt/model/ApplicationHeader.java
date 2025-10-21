package com.opendecimal.openmt.model;

public abstract class ApplicationHeader extends Block {

    public final static int NUM = 2;

    private MessageType messageType;

    private ApplicationHeaderInput.MessagePriority priority;

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public ApplicationHeaderInput.MessagePriority getPriority() {
        return priority;
    }

    public void setPriority(ApplicationHeaderInput.MessagePriority priority) {
        this.priority = priority;
    }

    @Override
    public int getNum() {
        return NUM;
    }

    public enum Direction {
        I, O;
    }

}
