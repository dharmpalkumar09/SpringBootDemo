package com.dharmpal.student.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "address")
public class Address {

    @Id

    @Column(name = "address_id")
    private Long id;
    private String houseNo;
    private String addressLine1;
    private String getAddressLine2;
    private String city;
    private String district;
    private String state;
    private int pinCode;
    @OneToOne(mappedBy = "address")
    private Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Column(name = "student_id_list")
    @ElementCollection
    private List<Long> studentIds = new ArrayList<>();

    public List<Long> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(List<Long> studentIds) {
        this.studentIds = studentIds;
    }


    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", houseNo='" + houseNo + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", getAddressLine2='" + getAddressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                ", student=" + student +
                ", studentIds=" + studentIds +
                '}';
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getGetAddressLine2() {
        return getAddressLine2;
    }

    public void setGetAddressLine2(String getAddressLine2) {
        this.getAddressLine2 = getAddressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
