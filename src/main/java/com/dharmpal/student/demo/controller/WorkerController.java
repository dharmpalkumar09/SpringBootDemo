package com.dharmpal.student.demo.controller;


import com.dharmpal.student.demo.entities.Owner;
import com.dharmpal.student.demo.entities.Worker;
import com.dharmpal.student.demo.exceptions.OwnerServiceException;
import com.dharmpal.student.demo.model.Result;
import com.dharmpal.student.demo.repository.OwnerRepository;
import com.dharmpal.student.demo.repository.WorkerRepository;
import com.dharmpal.student.demo.service.OwnerService;
import com.dharmpal.student.demo.service.WorkerService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;


/**
 * @Prashant ,
 * This class will communicate with service class
 *
 */
@RestController
@RequestMapping("/worker")
@Api(value = "Worker Management System")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    private static final Logger log = LoggerFactory.getLogger(OwnerController.class);


    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result<String,Owner> getListOfWorkers(){
        log.info("/worker/getAll  endpoint is invoked");
        Result result = new Result("get all");
        try {
            result.setOutputObject(workerService.getListOfWorkers());
        }catch (OwnerServiceException ex1){
            log.error("Exception occured while searching alerts", ex1);
            result.setSuccess(false);
            result.getErrors().add(ex1.getMessage());
        }catch (Exception ex2){
            log.error("unexpected error occured while searching owners",ex2);
            result.setSuccess(false);
            result.getErrors().add(ex2.getMessage());
        }
        return result;
    }

    @GetMapping(value = "/getOne/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result<String,Owner> getWorkerById(@PathVariable Long id){
        log.info("/worker/getOne  endpoint is invoked"+ id);
        Result result = new Result(("id="+ id));
        try{
            result.setOutputObject(workerService.getWorkerById(id));
        }catch (OwnerServiceException ex1){
            log.error("Owner details was not found for id :"+id+"", ex1);
            result.setSuccess(false);
            result.getErrors().add(ex1.getMessage());
        }catch (Exception ex2){
            log.error("unexpected error occurred while searching owners",ex2);
            result.setSuccess(false);
            result.getErrors().add(ex2.getMessage());
        }

        return result;
    }
    @PostMapping(value = "/create",produces = MediaType.APPLICATION_JSON_VALUE ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Worker creteWorker( @RequestBody Worker worker){
        log.info("/worker/create  endpoint is invoked");
        Result result = new Result(worker);

        return workerService.creteWorker(worker);
    }

}
