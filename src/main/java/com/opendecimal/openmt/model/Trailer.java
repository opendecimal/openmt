package com.opendecimal.openmt.model;

import com.fasterxml.jackson.databind.JsonNode;

public class Trailer extends Block {

    public final static int NUM = 5;

    @Override
    public int getNum() {
        return NUM;
    }
}
