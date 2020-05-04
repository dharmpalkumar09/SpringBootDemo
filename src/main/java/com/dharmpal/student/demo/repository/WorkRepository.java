package com.dharmpal.student.demo.repository;


import com.dharmpal.student.demo.entities.Work;
import org.springframework.stereotype.Repository;



@Repository
public interface WorkRepository extends BaseRepository<Work,Long> {
}
