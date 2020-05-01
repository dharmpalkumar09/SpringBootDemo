package com.dharmpal.student.demo.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Result<I,O> implements Serializable {

    private I inputObject;
    private O outputObject;
    private boolean isSuccess;
    private List<String> errors;
    private String message;

    public Result(I inputObject){
       this.inputObject = inputObject;
       this.isSuccess= true;
       this.errors = new LinkedList<>();
       this.message=null;
    }

    public I getInputObject() {
        return inputObject;
    }

    public void setInputObject(I inputObject) {
        this.inputObject = inputObject;
    }

    public O getOutputObject() {
        return outputObject;
    }

    public void setOutputObject(O outputObject) {
        this.outputObject = outputObject;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result<?, ?> result = (Result<?, ?>) o;
        return isSuccess == result.isSuccess &&
                Objects.equals(inputObject, result.inputObject) &&
                Objects.equals(outputObject, result.outputObject) &&
                Objects.equals(errors, result.errors) &&
                Objects.equals(message, result.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputObject, outputObject, isSuccess, errors, message);
    }

    @Override
    public String toString() {
        return "Result{" +
                "inputObject=" + inputObject +
                ", outputObject=" + outputObject +
                ", isSuccess=" + isSuccess +
                ", errors=" + errors +
                ", message='" + message + '\'' +
                '}';
    }
}
