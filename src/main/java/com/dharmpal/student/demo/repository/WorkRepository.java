package com.dharmpal.student.demo.repository;

import com.dharmpal.student.demo.entities.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface WorkRepository extends JpaRepository<Work,Long> {
}
