package com.dharmpal.student.demo.enums;

public enum LogLevels {

    INFO("INFO"),
    WARN("WARN"),
    DEBUG("DEBUG"),
    ERROR("ERROR");

    private final String status;

    public String getStatus() {
        return status;
    }

    LogLevels(String status) {
        this.status = status;
    }
}
