package com.smartshield.smartshieldai.controller;

import com.smartshield.smartshieldai.entity.Threat;
import com.smartshield.smartshieldai.repository.ThreatRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/threats")
public class ThreatController {

    private final ThreatRepository threatRepository;

    public ThreatController(ThreatRepository threatRepository) {
        this.threatRepository = threatRepository;
    }

    @GetMapping
    public List<Threat> getAllThreats() {
        return threatRepository.findAll();
    }

    @PostMapping
    public Threat createThreat(@RequestBody Threat threat) {
        return threatRepository.save(threat);
    }
}