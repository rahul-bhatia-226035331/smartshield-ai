package com.smartshield.smartshieldai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/")
    public Map<String, String> home() {

        Map<String, String> response = new HashMap<>();

        response.put("application", "SmartShield AI");
        response.put("status", "Running");
        response.put("securityLevel", "Protected");

        return response;
    }
}