package com.dharmpal.student.demo.service;


import com.dharmpal.student.demo.controller.OwnerController;
import com.dharmpal.student.demo.entities.Worker;
import com.dharmpal.student.demo.exceptions.OwnerServiceException;
import com.dharmpal.student.demo.repository.WorkerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class WorkerService {


    @Autowired
    private WorkerRepository workerRepository;

    public List<Worker> getListOfWorkers() throws OwnerServiceException {
        return workerRepository.findAll();
    }

    public Worker getWorkerById(Long id) throws OwnerServiceException {
        return workerRepository.findById(id).get();
    }
    public Worker creteWorker(Worker worker){

        Timestamp time= new Timestamp(System.currentTimeMillis());
        worker.setCreatedTime(time);
        worker.setUpdatedTime(time);
        return workerRepository.save(worker);
    }
}
