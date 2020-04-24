package com.dharmpal.student.demo.repository;

import com.dharmpal.student.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student,Long>{
}
