package com.juzi.wage.model.entity;

public class Manager {
    private String systemStatus;

    public String getSystemStatus() {
        return systemStatus;
    }

    public void setSystemStatus(String systemStatus) {
        this.systemStatus = systemStatus == null ? null : systemStatus.trim();
    }
}