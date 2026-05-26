package com.smartshield.smartshieldai.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "threats")
public class Threat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String threatName;

    private String severity;

    private String location;

    public Threat() {
    }

    public Threat(String threatName, String severity, String location) {
        this.threatName = threatName;
        this.severity = severity;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}