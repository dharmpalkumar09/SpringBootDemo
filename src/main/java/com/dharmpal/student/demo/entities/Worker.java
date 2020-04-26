package com.dharmpal.student.demo.entities;

import com.dharmpal.student.demo.enums.LogLevels;
import com.dharmpal.student.demo.model.Address;
import io.swagger.annotations.ApiModel;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author Prashant
 * This class servers as POJO class for Worker_Details table
 *
 */

@Entity
@Table(name = "worker_details")
@ApiModel(description = "All details about the Worker. ")
public class Worker {

    @GeneratedValue
    @Id
    private Long id;

    @Column(name = "worker_first_name")
    private String firstName;

    @Column(name = "worker_last_name")
    private String lastName;

    @Column(name = "worker_address")
    @Embedded
    private Address address;

    @Column(name = "worker_id_proof")
    @Enumerated
    private IdProof idproof;

    @Column(name = "worker_contact_number")
    private String contactNo;

    @Column(name = "worker_rating")
    @Enumerated
    private Rating rating;

    @Column(name = "worker_requirement_type")
    @Enumerated
    private LogLevels.Worktype requirementType;

    @Column(name = "worker_total_earning")
    private Long totalEarning;

    @Column(name = "worker_per_day_cost")
    private Long  perDayCost;

    @Column(name = "worker_email_id")
    @NotNull(message = "Email Id can not be null")
    private String emailID;

    @Column(name = "updated_time")
    private Timestamp updatedTime;

    @Column(name = "created_time")
    private Timestamp createdTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public IdProof getIdproof() {
        return idproof;
    }

    public void setIdproof(IdProof idproof) {
        this.idproof = idproof;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public LogLevels.Worktype getRequirementType() {
        return requirementType;
    }

    public void setRequirementType(LogLevels.Worktype requirementType) {
        this.requirementType = requirementType;
    }

    public Long getTotalEarning() {
        return totalEarning;
    }

    public void setTotalEarning(Long totalEarning) {
        this.totalEarning = totalEarning;
    }

    public Long getPerDayCost() { return perDayCost; }

    public void setPerDayCost(Long perDayCost) { this.perDayCost = perDayCost; }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public Timestamp getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(id, worker.id) &&
                Objects.equals(firstName, worker.firstName) &&
                Objects.equals(lastName, worker.lastName) &&
                Objects.equals(address, worker.address) &&
                Objects.equals(idproof, worker.idproof) &&
                Objects.equals(contactNo, worker.contactNo) &&
                rating == worker.rating &&
                requirementType == worker.requirementType &&
                Objects.equals(totalEarning, worker.totalEarning) &&
                Objects.equals(emailID, worker.emailID) &&
                Objects.equals(updatedTime, worker.updatedTime) &&
                Objects.equals(createdTime, worker.createdTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, address, idproof, contactNo, rating, requirementType, totalEarning, emailID, updatedTime, createdTime);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", idproof=" + idproof +
                ", contactNo='" + contactNo + '\'' +
                ", rating=" + rating +
                ", requirementType=" + requirementType +
                ", totalEarning=" + totalEarning +
                ", emailID='" + emailID + '\'' +
                ", updatedTime=" + updatedTime +
                ", createdTime=" + createdTime +
                '}';
    }
}
