package com.cyrils.java.lekce14;
//Dědí z java.lang.RuntimeException a implementuje CustomExceptions interface
public class InvalidYearException extends RuntimeException implements CustomExceptions {
    public InvalidYearException(String message) {
        super(message);
    }
    @Override
    public String getErrorCode() {
        return "YEAR_NOT_VALID_01"; //vlastni chybovy kod
    }

    @Override
    public String getDetails() {
        return "Year validation failed - year must be between 1 and 9999";
    }

    @Override
    public String getOriginalMessage() {
        return super.getMessage();
    }
}

