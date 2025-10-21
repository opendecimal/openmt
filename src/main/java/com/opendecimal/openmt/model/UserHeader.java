package com.opendecimal.openmt.model;

public class UserHeader extends Block {

    public final static int NUM = 3;

    private String bankingPriority;

    private String messageUserReference;

    @Override
    public int getNum() {
        return NUM;
    }

    public String getBankingPriority() {
        return bankingPriority;
    }

    public void setBankingPriority(String bankingPriority) {
        this.bankingPriority = bankingPriority;
    }

    public String getMessageUserReference() {
        return messageUserReference;
    }

    public void setMessageUserReference(String messageUserReference) {
        this.messageUserReference = messageUserReference;
    }
}
