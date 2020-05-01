package com.dharmpal.student.demo.enums;

public enum NotificationEvent {
    OWNER("OWNER"),
    WORKER("WORKER");

    private String eventType;

    NotificationEvent(String eventType) {
        this.eventType = eventType;
    }

    public String getEventType() {
        return eventType;
    }
}
