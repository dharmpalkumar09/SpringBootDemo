package com.dharmpal.student.demo.enums;

public enum LogLevels {

    INFO("INFO"),
    WARN("WARN"),
    DEBUG("DEBUG"),
    ERROR("ERROR");

    private final String status;

    public String getStatus() {
        return status;
    }

    LogLevels(String status) {
        this.status = status;
    }

    public enum Worktype {
        URGENT,
        REGULAR
    }

    public enum Paymentmode {
        /*
        1. Cash
        2. Online
        3. Cheque
        4. UPI
         */
        CASH,ONLINE,CHEQUE,UPI
    }
}
