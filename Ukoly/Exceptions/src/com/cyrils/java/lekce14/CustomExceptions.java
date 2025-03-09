package com.cyrils.java.lekce14;
//interface pro IllegalAgeException a InvalidYearException
public interface CustomExceptions {
    //abstract method
     //return Machine-readable error code 
    String getErrorCode();
    //return human-readable error message
    String getDetails();
    //return original exception message
    String getOriginalMessage();
    
    //Je moznost zotaveni z vyjimky?
    default boolean isRecoverable() {
        return true; //vychozi hodnota
    }
}
