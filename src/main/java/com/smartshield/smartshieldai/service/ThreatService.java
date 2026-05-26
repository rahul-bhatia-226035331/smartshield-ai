package com.smartshield.smartshieldai.service;

import com.smartshield.smartshieldai.entity.Threat;
import com.smartshield.smartshieldai.repository.ThreatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThreatService {

    private final ThreatRepository threatRepository;

    public ThreatService(ThreatRepository threatRepository) {
        this.threatRepository = threatRepository;
    }

    public Threat saveThreat(Threat threat) {
        return threatRepository.save(threat);
    }

    public List<Threat> getAllThreats() {
        return threatRepository.findAll();
    }
}