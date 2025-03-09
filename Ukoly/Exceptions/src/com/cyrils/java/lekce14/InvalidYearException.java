package com.cyrils.java.lekce14;
//Dědí z java.lang.RuntimeException a implementuje CustomExceptions interface
public class InvalidYearException extends RuntimeException implements CustomExceptions {
    private final String errorCode;
    private final String details;
    // default konstruktor
    public InvalidYearException(String message, String errorCode, String details) {
        super(message);
        this.errorCode = errorCode;
        this.details = details;
    }
    //Additional overridden methods
    @Override
    public String getErrorCode() {
         return errorCode;
    }
    @Override
    public String getDetails() { 
        return details; 
    }
    @Override
    public String getOriginalMessage() {
        return super.getMessage();
    }
}

