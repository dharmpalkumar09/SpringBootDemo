package com.dharmpal.student.demo.model;

public class ErrorMessage {
    private String errorMessage;
    private int errorCode;

    @Override
    public String toString() {
        return "ErrorMessage{" +
                "errorMessage='" + errorMessage + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
