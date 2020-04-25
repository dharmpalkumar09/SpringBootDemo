package com.dharmpal.student.demo.exceptions;


import com.dharmpal.student.demo.enums.NavinBharatCustomException;

/**
 *
 * This class will handle the custom exception
 */
public class NavinBharatException extends RuntimeException {

    private String message;

    public NavinBharatException(String message ){
        super(message);
    }

    public NavinBharatException(String message, Throwable cause){
        super(message,cause);
    }


}
