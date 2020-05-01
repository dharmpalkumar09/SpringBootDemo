package com.dharmpal.student.demo.service;

import antlr.StringUtils;
import com.dharmpal.student.demo.entities.Owner;
import com.dharmpal.student.demo.exceptions.OwnerServiceException;
import com.dharmpal.student.demo.repository.OwnerRepository;
import com.dharmpal.student.demo.utils.OwnerInputValidation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    private static final Logger log = LoggerFactory.getLogger(OwnerService.class);

    public List<Owner> getListOfOwners() throws OwnerServiceException {
        return ownerRepository.findAll();
    }

    public Owner getOwnerById(Long id) throws OwnerServiceException {
        return ownerRepository.findById(id).get();
    }
    public Owner creteOwner(Owner owner)throws OwnerServiceException{
        this.validateOwnerInputRequest(owner);
        Timestamp time= new Timestamp(System.currentTimeMillis());
        owner.setCreatedTime(time);
        owner.setUpdatedTime(time);
        return ownerRepository.save(owner);
    }


    public void validateOwnerInputRequest(Owner owner)throws OwnerServiceException {
        List<String> messages = new LinkedList<>();
        if(owner.getName()==null){
            messages.add("name is mandatory field");
        }

        if(!CollectionUtils.isEmpty(messages)){
           // log.error("validation errors occurred ", StringUtils.j);
            throw new OwnerServiceException("validation errors occurred",messages);
        }
    }

}
