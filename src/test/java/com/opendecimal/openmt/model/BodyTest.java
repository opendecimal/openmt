package com.opendecimal.openmt.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyTest {

    @Test
    void getNum() {
        assertEquals(4, (new Body()).getNum());
    }
}