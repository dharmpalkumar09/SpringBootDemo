package com.dharmpal.student.demo.repository;

import com.dharmpal.student.demo.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends BaseRepository<Owner,Long> {


    @Query("SELECT ownerDetails FROM Owner ownerDetails WHERE ownerDetails.owner_name =name and ownerDetails.owner_contact_no=contactNo ")
    List<Owner>getListOfOwners(@Param("name")String name,@Param("contactNo")String contactNo);
}
