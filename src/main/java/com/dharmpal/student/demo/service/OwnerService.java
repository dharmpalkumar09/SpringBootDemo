package com.dharmpal.student.demo.service;

import com.dharmpal.student.demo.entities.Owner;
import com.dharmpal.student.demo.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;


    public List<Owner> getListOfOwners(){
        return ownerRepository.findAll();
    }

    public Owner creteOwner(Owner owner){
        return ownerRepository.save(owner);
    }

}
