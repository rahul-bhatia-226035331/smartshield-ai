package com.smartshield.smartshieldai.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreatControllerTest {

    @Test
    void testThreatStatus() {

        String expected = "Detected";
        String actual = "Blocked";

        assertEquals(expected, actual);
    }
}