package com.opendecimal.openmt.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrailerTest {

    @Test
    void getNum() {
        assertEquals(5, (new Trailer()).getNum());
    }
}