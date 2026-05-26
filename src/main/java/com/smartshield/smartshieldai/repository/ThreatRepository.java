package com.smartshield.smartshieldai.repository;

import com.smartshield.smartshieldai.entity.Threat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThreatRepository extends JpaRepository<Threat, Long> {

}