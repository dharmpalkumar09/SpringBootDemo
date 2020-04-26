package com.dharmpal.student.demo.controller;


import com.dharmpal.student.demo.NavinBharatApplication;
import com.dharmpal.student.demo.entities.Owner;
import com.dharmpal.student.demo.exceptions.OwnerServiceException;
import com.dharmpal.student.demo.model.Result;
import com.dharmpal.student.demo.service.OwnerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.executable.ValidateOnExecution;
import java.awt.*;
import java.util.List;

/**
 * @Prashant ,
 * This class will communicate with service class
 *
 */

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    private static final Logger log = LoggerFactory.getLogger(OwnerController.class);


    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result<String,Owner> getListOfOwners(){
        log.info("/owner/getAll  endpoint is invoked");
        Result result = new Result("get all");
        try {
            result.setOutputObject(ownerService.getListOfOwners());
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
    public Result<String,Owner> getOwnerById(@PathVariable Long id){
        log.info("/owner/geOne  endpoint is invoked"+ id);
        Result result = new Result(("id="+ id));
        try{
            result.setOutputObject(ownerService.getOwnerById(id));
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
    public Owner creteOwner( @RequestBody Owner owner){
        log.info("/owner/create  endpoint is invoked");
        Result result = new Result(owner);

        return ownerService.creteOwner(owner);
    }



}
