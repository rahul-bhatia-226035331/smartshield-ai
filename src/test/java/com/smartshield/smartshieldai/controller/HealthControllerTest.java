package com.smartshield.smartshieldai.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthControllerTest {

    @Test
    void testApplicationName() {

        String appName = "SmartShield AI";

        assertEquals("SmartShield AI", appName);
    }
}