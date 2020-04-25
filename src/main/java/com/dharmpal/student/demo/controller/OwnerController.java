package com.dharmpal.student.demo.controller;


import com.dharmpal.student.demo.entities.Owner;
import com.dharmpal.student.demo.service.OwnerService;
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


    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Owner> getListOfOwners(){
        return ownerService.getListOfOwners();
    }

    @PostMapping(value = "/create",produces = MediaType.APPLICATION_JSON_VALUE ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Owner creteOwner( @RequestBody Owner owner){
       return ownerService.creteOwner(owner);
    }



}
