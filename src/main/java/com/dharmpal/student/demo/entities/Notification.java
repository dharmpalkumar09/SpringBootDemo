package com.dharmpal.student.demo.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Notification {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "notification_title")
    private String notificationTitle;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private Timestamp createdOn;

    @Column(name = "created_for")
    private String createdFor;

    @Column(name = "notification_desc")
    private String notificationDesc;

    @Column(name = "seen_status")
    private boolean seenStatus;


    public String getNotificationTitle() {
        return notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedFor() {
        return createdFor;
    }

    public void setCreatedFor(String createdFor) {
        this.createdFor = createdFor;
    }

    public String getNotificationDesc() {
        return notificationDesc;
    }

    public void setNotificationDesc(String notificationDesc) {
        this.notificationDesc = notificationDesc;
    }

    public boolean isSeenStatus() {
        return seenStatus;
    }

    public void setSeenStatus(boolean seenStatus) {
        this.seenStatus = seenStatus;
    }
}
