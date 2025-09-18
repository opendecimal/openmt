package com.opendecimal.openmt.core;

public class MTFactory implements java.io.Serializable {

    public MTParser createParser(String content) {
        return new BlockingMTParser();
    }

    public MTGenerator createGenerator() {
        return new BlockingMTGenerator();
    }
}
