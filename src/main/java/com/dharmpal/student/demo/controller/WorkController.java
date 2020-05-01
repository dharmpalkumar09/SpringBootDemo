package com.dharmpal.student.demo.controller;

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
            result.getMessages().add(ex1.getMessage());
        }catch (Exception ex2){
            log.error("unexpected error occured while searching owners",ex2);
            result.setSuccess(false);
            result.getMessages().add(ex2.getMessage());
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
            result.getMessages().add(ex1.getMessage());
        }catch (Exception ex2){
            log.error("unexpected error occured while searching owners",ex2);
            result.setSuccess(false);
            result.getMessages().add(ex2.getMessage());
        }

        return result;
    }
    @PostMapping(value = "/create",produces = MediaType.APPLICATION_JSON_VALUE ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Work creteWork( @RequestBody Work work){
        log.info("/work/create  endpoint is invoked");
        Result result = new Result(work);

        return workService.creteWork(work);
    }


}
