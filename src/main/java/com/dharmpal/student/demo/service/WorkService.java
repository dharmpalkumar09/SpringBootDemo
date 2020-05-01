package com.dharmpal.student.demo.service;


import com.dharmpal.student.demo.entities.Owner;
import com.dharmpal.student.demo.entities.Work;
import com.dharmpal.student.demo.exceptions.OwnerServiceException;
import com.dharmpal.student.demo.repository.WorkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class WorkService {


    @Autowired
    private WorkRepository workRepository;

    private static final Logger log = LoggerFactory.getLogger(OwnerService.class);

    @Autowired
    private OwnerService ownerService;

    public List<Work> getListOfWorks() throws OwnerServiceException {
        return workRepository.findAll();
    }

    public Work getWorkById(Long id) throws OwnerServiceException {
        return workRepository.findById(id).get();
    }
    public Work creteWork(Work work)throws Exception{
       this.validateWorkInputRequest(work);
       try {
           Owner owner = ownerService.getOwnerById(Long.parseLong(work.getCreatedById()));
           if (owner != null) {
               Timestamp time = new Timestamp(System.currentTimeMillis());
               work.setCreatedOn(time);
               work.setCreatedByName(owner.getName());
               return workRepository.save(work);
           }
       }catch (Exception ex){
           log.error("Owner with given id does not exist"+ ex.getMessage());
           List<String>msg= new ArrayList<>();
           msg.add("Owner with given id:"+work.getCreatedById()+ " does not exist");
           throw new OwnerServiceException("Owner with given id does not exist",msg);
       }
       return null;
    }


    public void validateWorkInputRequest(Work work)throws OwnerServiceException {
        List<String> messages = new LinkedList<>();
        if(work.getWorkType()==null){
            messages.add("workType can not be null");
        }
        if(work.getWorkLocation()==null){
            messages.add("workLocation can not be null");
        }
        if(work.getWorkCategory()==null){
            messages.add("workCategory can not be null");
        }
        if(work.getWorkLocation()==null){
            messages.add("workLocation can not be null");
        }
        if(work.getCreatedById()==null){
            messages.add("createdById can not be null");
        }

        if(!CollectionUtils.isEmpty(messages)){
            // log.error("validation errors occurred ", StringUtils.j);
            throw new OwnerServiceException("validation errors occurred",messages);
        }
    }
}
