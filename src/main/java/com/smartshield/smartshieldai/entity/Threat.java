package com.smartshield.smartshieldai.entity;

import jakarta.persistence.*;

@Entity
public class Threat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String threatName;
    private String severity;
    private String status;

    public Threat() {
    }

    public Threat(String threatName, String severity, String status) {
        this.threatName = threatName;
        this.severity = severity;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getThreatName() {
        return threatName;
    }

    public void setThreatName(String threatName) {
        this.threatName = threatName;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}