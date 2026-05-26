package com.smartshield.smartshieldai.controller;

import com.smartshield.smartshieldai.entity.Threat;
import com.smartshield.smartshieldai.service.ThreatService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HealthController {

    private final ThreatService threatService;

    public HealthController(ThreatService threatService) {
        this.threatService = threatService;
    }

    @GetMapping("/")
    public Map<String, String> home() {

        Map<String, String> response = new HashMap<>();

        response.put("application", "SmartShield AI");
        response.put("status", "Running");
        response.put("securityLevel", "Protected");

        return response;
    }

    @PostMapping("/threats")
    public Threat createThreat(@RequestBody Threat threat) {
        return threatService.saveThreat(threat);
    }

    @GetMapping("/threats")
    public List<Threat> getAllThreats() {
        return threatService.getAllThreats();
    }
}