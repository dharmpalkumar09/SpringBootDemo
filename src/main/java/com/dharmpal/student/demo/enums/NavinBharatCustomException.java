package com.dharmpal.student.demo.enums;

public enum NavinBharatCustomException {

    JPA_READ_EXCEPTION("JPA_READ_EXCEPTION"),
    NULL_POINTER_EXCEPTION("NULL_POINTER_EXCEPTION");

    NavinBharatCustomException(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    private String exceptionType;


    public String getExceptionType() {
        return exceptionType;
    }
}
