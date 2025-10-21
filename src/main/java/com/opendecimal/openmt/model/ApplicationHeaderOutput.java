package com.opendecimal.openmt.model;

import java.util.Date;

public class ApplicationHeaderOutput extends ApplicationHeader {

    public final Direction direction = Direction.O;

    private Date inputTime;

    private String senderBic12;

    private String sessionNum;

    private String sequenceNum;

    private Date outputTime;

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public String getSenderBic12() {
        return senderBic12;
    }

    public void setSenderBic12(String senderBic12) {
        this.senderBic12 = senderBic12;
    }

    public String getSessionNum() {
        return sessionNum;
    }

    public void setSessionNum(String sessionNum) {
        this.sessionNum = sessionNum;
    }

    public String getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public Date getOutputTime() {
        return outputTime;
    }

    public void setOutputTime(Date outputTime) {
        this.outputTime = outputTime;
    }
}
