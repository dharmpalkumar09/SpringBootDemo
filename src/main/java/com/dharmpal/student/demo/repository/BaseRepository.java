package com.dharmpal.student.demo.repository;


import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * This interface is common/base for all repository interface.Which contains all common methods which are going to talk to a table
 * @author Prashant
 *
 */
public interface BaseRepository<T,I extends Serializable> extends Repository, JpaSpecificationExecutor<T> {


    void delete(T entityObject) throws IllegalArgumentException, DataAccessException;


    List<T> findAll() throws DataAccessException;

    Optional<T> findOne(I id)  throws IllegalArgumentException, DataAccessException;

    T save(T entityObject) throws  IllegalArgumentException, DataAccessException;

    @Query(value ="SELECT SYSDATE FROM DUAL",nativeQuery = true)
    Date getSystemdate();


}
