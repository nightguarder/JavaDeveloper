package com.cyrils.java.lekce14;

//Dědí z java.lang.Exception a implementuje CustomExceptions
public class IllegalAgeException extends Exception implements CustomExceptions {
    public IllegalAgeException(String message) {
        super(message);
    }
    @Override
    public String getErrorCode() {
        return "AGE_NOT_VALID_01"; //vlastni chybovy kod
    }

    @Override
    public String getDetails() {
        return "Age validation failed - user must be at least 18 years old";
    }

    @Override
    public String getOriginalMessage() {
        return super.getMessage();
    }

    
}
