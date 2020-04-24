package com.dharmpal.student.demo.repository;

import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<T> extends JpaRepository<T, ID> {

}
