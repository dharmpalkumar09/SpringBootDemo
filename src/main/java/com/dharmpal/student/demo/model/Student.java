package com.dharmpal.student.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "Student_Details")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "student_id")
    private Long id;
    @Column(name = "student_first_name")
    private String firstName;
    @Column(name = "student_age")
    private int age;
    @Column(name = "student_last_name")
    private String lastName;
    @Column(name = "student_college")
    private String college;


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
