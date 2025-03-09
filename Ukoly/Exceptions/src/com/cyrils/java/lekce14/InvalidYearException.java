package com.cyrils.java.lekce14;
//Dědí z java.lang.RuntimeException a implementuje CustomExceptions interface
public class InvalidYearException extends RuntimeException implements CustomExceptions {
    // default konstruktor
    public InvalidYearException() {
        super("Neplatný rok!"); // Výchozí zpráva
    }
    public InvalidYearException(String message) {
        super(message);
    }
    public InvalidYearException(String message, Throwable cause) {
        super(message, cause);
    }
    //Additional overridden methods
    @Override
    public String getErrorCode() {
         return "YEAR_NOT_VALID";
    }
    @Override
    public String getDetails() { 
        return "Zadaný rok je neplatný!"; 
    }
    @Override
    public String getOriginalMessage() {
        return super.getMessage();
    }
}

