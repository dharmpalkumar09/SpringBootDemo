package com.dharmpal.student.demo.controller;

import com.dharmpal.student.demo.entities.Owner;
import com.dharmpal.student.demo.entities.Work;
import com.dharmpal.student.demo.exceptions.OwnerServiceException;
import com.dharmpal.student.demo.model.Result;
import com.dharmpal.student.demo.service.WorkService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @Prashant
 * This class will communicate with service class
 *
 */

@RestController
@RequestMapping("/work")
@Api(value = "Work Management System")
public class WorkController {

    @Autowired
    private WorkService workService;

    private static final Logger log = LoggerFactory.getLogger(OwnerController.class);


    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result<String, Work> getListOfWorks(){
        log.info("/work/getAll  endpoint is invoked");
        Result result = new Result("get all");
        try {
            result.setOutputObject(workService.getListOfWorks());
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
    public Result<String,Work> getWorkById(@PathVariable Long id){
        log.info("/work/getOne  endpoint is invoked"+ id);
        Result result = new Result(("id="+ id));
        try{
            result.setOutputObject(workService.getWorkById(id));
        }catch (OwnerServiceException ex1){
            log.error("Owner details was not found for id :"+id+"", ex1);
            result.setSuccess(false);
            result.getErrors().add(ex1.getMessage());
        }catch (Exception ex2){
            log.error("unexpected error occured while searching owners",ex2);
            result.setSuccess(false);
            result.getErrors().add(ex2.getMessage());
        }

        return result;
    }
    @PostMapping(value = "/create",produces = MediaType.APPLICATION_JSON_VALUE ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<String,Work> creteWork( @RequestBody Work work){

        log.info("/work/create  endpoint is invoked");
        Result result = new Result("For ownerId:"+work.getCreatedById());

        try{
            result.setOutputObject(workService.creteWork(work));
        }catch (OwnerServiceException ex){
            log.error("Exception occured while creating Work",ex);
            result.setSuccess(false);
            result.setErrors(ex.getErrors());
            result.setMessage(ex.getMessage());
        }catch (Exception ex1){
            log.error("Exception occured while creating Work",ex1);
            result.setSuccess(false);
            List<String> msg= new ArrayList<>();
            msg.add("Owner with given id:"+work.getCreatedById()+ " does not exist");
            result.setErrors(msg);
            result.setMessage(ex1.getMessage());
        }

        if(result.getErrors().size()==0){
            result.setMessage("Work created successfully ");
        }
        return result;

    }


}
