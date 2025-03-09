package com.cyrils.java.lekce14;

public interface CustomExceptions {
    //abstract method
     //return Machine-readable error code 
    String getErrorCode();
    //return human-readable error message
    String getDetails();
    //return original exception message
    String getOriginalMessage();
    
}
