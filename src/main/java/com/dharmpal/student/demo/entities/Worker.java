package com.dharmpal.student.demo.entities;

import com.dharmpal.student.demo.model.Address;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Worker {


    private Long id;
    private String firstNname;
    private String lastName;
    private Address address;
    private IdProof idproof;
    private String contactNo;
    private Rating rating;
    private Worktype experise;
    private Long totalEarning;

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", firstNname='" + firstNname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", idproof=" + idproof +
                ", contactNo='" + contactNo + '\'' +
                ", rating=" + rating +
                ", experise=" + experise +
                ", totalEarning=" + totalEarning +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstNname() {
        return firstNname;
    }

    public void setFirstNname(String firstNname) {
        this.firstNname = firstNname;
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

    public Worktype getExperise() {
        return experise;
    }

    public void setExperise(Worktype experise) {
        this.experise = experise;
    }

    public Long getTotalEarning() {
        return totalEarning;
    }

    public void setTotalEarning(Long totalEarning) {
        this.totalEarning = totalEarning;
    }
}
