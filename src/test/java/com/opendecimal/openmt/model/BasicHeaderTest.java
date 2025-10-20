package com.opendecimal.openmt.model;

import org.junit.jupiter.api.Test;
import com.opendecimal.openmt.model.BasicHeader.*;

import static org.junit.jupiter.api.Assertions.*;

class BasicHeaderTest {

    @Test
    void getNum() {
        assertEquals(1, (new BasicHeader(ApplicationID.FIN, APPDU._01)).getNum());
    }
}