package com.opendecimal.openmt.model;

public class BasicHeader extends Block {

    public final static int NUM = 1;

    private final ApplicationID applicationID;

    private final APPDU appdu;

    private String bic12;

    private String sessionNum;

    private String sequenceNum;

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

        public static ApplicationID of(char cr) {
            return switch (cr) {
                case 'F' -> FIN;
                case 'A' -> APC;
                case 'L' -> LTC;
                default -> null;
            };
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

        static public APPDU of(String str) {
            return switch (str) {
                case "01" -> _01;
                case "02" -> _02;
                case "03" -> _03;
                case "04" -> _04;
                default -> null;
            };
        }
    }

}
