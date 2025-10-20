package com.opendecimal.openmt.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationHeaderTest {

    @Test
    void getNum() {
        assertEquals(2, (new ApplicationHeader()).getNum());
    }
}