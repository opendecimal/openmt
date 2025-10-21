package com.opendecimal.openmt.model;

public class BasicHeader extends Block {

    public final static int NUM = 1;

    private final ApplicationID applicationID;

    private final APPDU appdu;

    private String bic12;

    private Integer sessionNum;

    private Integer sequenceNum;

    public BasicHeader(ApplicationID applicationID, APPDU appdu) {
        this.applicationID = applicationID;
        this.appdu = appdu;
    }

    @Override
    public int getNum() {
        return NUM;
    }

    public ApplicationID getApplicationID() {
        return applicationID;
    }

    public APPDU getAppdu() {
        return appdu;
    }

    public String getBic12() {
        return bic12;
    }

    public void setBic12(String bic12) {
        this.bic12 = bic12;
    }

    public Integer getSessionNum() {
        return sessionNum;
    }

    public void setSessionNum(Integer sessionNum) {
        this.sessionNum = sessionNum;
    }

    public Integer getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(Integer sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public enum ApplicationID {
        // FINANCIAL APPLICATION
        FIN("F"),
        // APPLICATION CONTROL
        APC("A"),
        // LOGICAL TERMINAL CONTROL
        LTC("L");
        private final String label;
        ApplicationID(String label) {
            this.label = label;
        }

        public String getLabel() {
            return this.label;
        }
    }

    public enum APPDU {
        //  GPA, FIN
        _01("01"),
        // ACK, UAK, SAK
        _02("02"),
        // CHOICE
        _03("03"),
        // EXIT
        _04("04");
        private final String label;
        APPDU(String label) {
            this.label = label;
        }

        public String getLabel() {
            return this.label;
        }
    }

}
