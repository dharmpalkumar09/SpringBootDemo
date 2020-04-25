package com.dharmpal.student.demo.entities;

import com.dharmpal.student.demo.model.Address;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Prashant
 * This class serves as POJO class for Table Owner_details
 */

@Entity
@Table(name = "Owner_Details")
public class Owner {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "owner_name")
    @NotNull(message = "name can not be null")
    private String name;

    @Column(name = "owner_dob")
    private Date dob;

    @Column(name = "owner_address")
    @Embedded
    @NotNull(message = "address can not be null")
    private Address address;

    @Column(name = "owner_id_proof")
    @Embedded
    @NotNull(message = "idproof can not be null")
    private IdProof idproof;

    @Column(name= "owner_contact_no")
    @NotNull(message = "Contact Number  can not be null")
    private String contactNo;

    @Column(name = "owner_pan_card_no")
    @NotNull(message = "Pan Card Number  can not be null")
    private String panCardNo;

    @Column(name = "owner_aadhar_no")
    @NotNull(message = "Aadhar Number can not be null")
    private String aadharNo;

    @Column(name = "owner_email_id")
    @NotNull(message = "Email Id can not be null")
    private String emailID;

    @Column(name = "owner_gst_no")
    private String gstNo;

    @Column(name = "owner_rating")
    @Enumerated(EnumType.ORDINAL)
    private Rating rating;

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

    public String getName() {
        return name;
    }

    public Date getDob() { return dob; }

    public void setDob(Date dob) { this.dob = dob; }

    public void setName(String name) {
        this.name = name;
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

    public String getPanCardNo() { return panCardNo; }

    public void setPanCardNo(String panCardNo) { this.panCardNo = panCardNo; }

    public String getAadharNo() { return aadharNo; }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getGstNo() { return gstNo; }

    public void setGstNo(String gstNo) { this.gstNo = gstNo; }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Timestamp getUpdatedTime() { return updatedTime; }

    public void setUpdatedTime(Timestamp updatedTime) { this.updatedTime = updatedTime; }

    public Timestamp getCreatedTime() { return createdTime; }

    public void setCreatedTime(Timestamp createdTime) { this.createdTime = createdTime; }
}