package com.smartshield.smartshieldai.controller;

import com.smartshield.smartshieldai.entity.Threat;
import com.smartshield.smartshieldai.repository.ThreatRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PutMapping("/{id}")
    public Threat updateThreat(@PathVariable Long id,
                               @RequestBody Threat updatedThreat) {

        Optional<Threat> optionalThreat = threatRepository.findById(id);

        if (optionalThreat.isPresent()) {

            Threat threat = optionalThreat.get();

            threat.setThreatName(updatedThreat.getThreatName());
            threat.setSeverity(updatedThreat.getSeverity());
            threat.setStatus(updatedThreat.getStatus());

            return threatRepository.save(threat);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteThreat(@PathVariable Long id) {

        threatRepository.deleteById(id);

        return "Threat deleted successfully";
    }
}