package com.opendecimal.openmt.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserHeaderTest {

    @Test
    void getNum() {
        assertEquals(3, (new UserHeader()).getNum());
    }
}