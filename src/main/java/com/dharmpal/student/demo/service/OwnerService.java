package com.dharmpal.student.demo.service;

import com.dharmpal.student.demo.entities.Owner;
import com.dharmpal.student.demo.exceptions.OwnerServiceException;
import com.dharmpal.student.demo.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;


    public List<Owner> getListOfOwners() throws OwnerServiceException {
        return ownerRepository.findAll();
    }

    public Owner getOwnerById(Long id) throws OwnerServiceException {
        return ownerRepository.findById(id).get();
    }
    public Owner creteOwner(Owner owner){

        Timestamp time= new Timestamp(System.currentTimeMillis());
        owner.setCreatedTime(time);
        owner.setUpdatedTime(time);
        return ownerRepository.save(owner);
    }

}