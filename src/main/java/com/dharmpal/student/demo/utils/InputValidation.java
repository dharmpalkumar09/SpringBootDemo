package com.dharmpal.student.demo.utils;

import antlr.StringUtils;
import com.dharmpal.student.demo.controller.OwnerController;
import com.dharmpal.student.demo.entities.Owner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.util.LinkedList;
import java.util.List;

public  class InputValidation {

    private static final Logger log = LoggerFactory.getLogger(InputValidation.class);
    public void validateOwnerInputRequest(Owner owner){
        List<String> messages = new LinkedList<>();
        if(owner.getName()==null){
            messages.add("name is mandatory field");
        }

//        if(!CollectionUtils.isEmpty(messages)){
//            log.error("validation errors occurred ", StringUtils.j);
//            throw
//        }
    }

}
