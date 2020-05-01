package com.dharmpal.student.demo.entities;

import com.dharmpal.student.demo.enums.LogLevels;
import com.dharmpal.student.demo.enums.WorkCategory;
import io.swagger.annotations.ApiModel;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "work_details")
@ApiModel(description = "All details about the Owner. ")
public class Work {

    @GeneratedValue
    @Id
    private Long Id;

    @Column(name = "work_type")
    private LogLevels.Worktype workType;

    @Column(name = "work_description")
    private String description;

    @Column(name = "work_location")
    private String workLocation;

    @Column(name = "work_duration")
    private int duration;

    @Column(name = "work_category")
    @Enumerated
    private WorkCategory workCategory;

    @Column(name = "work_created_by_name")
    private String createdByName;

    @Column(name = "work_created_by_id")
    private String createdById;

    @Column(name = "man_days_estimation")
    private int manDaysEstimation; // number of days work will get finished

    @Column(name = "work_cost_estimation")
    private int costEstimation;

    @Column(name = "payment_mode")
    private LogLevels.Paymentmode paymentMode;

    @Column(name = "other_info")
    private  String otherInfo;

    @Column(name = "work_created_on")
    private Date createdOn;

    @Column(name = "work_valid_up_to")
    private  Date validUpto;

    @Column(name = "is_active")
    private String isActive;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public LogLevels.Worktype getWorkType() {
        return workType;
    }

    public void setWorkType(LogLevels.Worktype workType) {
        this.workType = workType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public WorkCategory getWorkCategory() {
        return workCategory;
    }

    public void setWorkCategory(WorkCategory workCategory) {
        this.workCategory = workCategory;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    public int getManDaysEstimation() {
        return manDaysEstimation;
    }

    public void setManDaysEstimation(int manDaysEstimation) {
        this.manDaysEstimation = manDaysEstimation;
    }

    public int getCostEstimation() {
        return costEstimation;
    }

    public void setCostEstimation(int costEstimation) {
        this.costEstimation = costEstimation;
    }

    public LogLevels.Paymentmode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(LogLevels.Paymentmode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getValidUpto() {
        return validUpto;
    }

    public void setValidUpto(Date validUpto) {
        this.validUpto = validUpto;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Work{" +
                "Id=" + Id +
                ", workType=" + workType +
                ", description='" + description + '\'' +
                ", workLocation='" + workLocation + '\'' +
                ", duration=" + duration +
                ", workCategory=" + workCategory +
                ", createdByName='" + createdByName + '\'' +
                ", createdById='" + createdById + '\'' +
                ", manDaysEstimation=" + manDaysEstimation +
                ", costEstimation=" + costEstimation +
                ", paymentMode=" + paymentMode +
                ", otherInfo='" + otherInfo + '\'' +
                ", createdOn=" + createdOn +
                ", validUpto=" + validUpto +
                ", isActive='" + isActive + '\'' +
                '}';
    }
}
