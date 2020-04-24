package com.dharmpal.student.demo.model;

public class UpdateStatus {
    private int statusCode;
    private ErrorMessage errorMessage;

    @Override
    public String toString() {
        return "UpdateStatus{" +
                "statusCode=" + statusCode +
                ", errorMessage=" + errorMessage +
                '}';
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }
}

