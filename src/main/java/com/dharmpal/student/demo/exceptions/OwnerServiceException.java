package com.dharmpal.student.demo.exceptions;



import java.util.LinkedList;
import java.util.List;

public class OwnerServiceException extends  Exception{
    private static final long serialVersionUID = 1L;
    private List<String> errors = new LinkedList<>();
    private String message;


    public OwnerServiceException(String message){
        super(message);
        this.message=message;
        this.errors.add(message);
    }

    public OwnerServiceException(String message, List<String>msg){
        super(message);
        this.message=message;
        this.errors.addAll(msg);
    }

    public List<String> getErrors() {
        return errors;
    }
    public OwnerServiceException(String message,Throwable t){
        super(message, t);
        this.message=message;
        this.errors.add(message);
    }

    public String toString(){return "OwnerServiceException{} "+ super.toString(); }
}
