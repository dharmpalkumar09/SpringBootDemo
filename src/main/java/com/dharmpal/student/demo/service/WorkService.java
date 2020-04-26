package com.dharmpal.student.demo.service;


import com.dharmpal.student.demo.entities.Work;
import com.dharmpal.student.demo.exceptions.OwnerServiceException;
import com.dharmpal.student.demo.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class WorkService {


    @Autowired
    private WorkRepository workRepository;

    public List<Work> getListOfWorks() throws OwnerServiceException {
        return workRepository.findAll();
    }

    public Work getWorkById(Long id) throws OwnerServiceException {
        return workRepository.findById(id).get();
    }
    public Work creteOwner(Work work){

        Timestamp time= new Timestamp(System.currentTimeMillis());
//        work.setCreatedTime(time);
//        work.setUpdatedTime(time);
        return workRepository.save(work);
    }
}
