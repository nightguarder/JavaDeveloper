package com.cyrils.java.lekce14;
public class Main {
    //main method
    public static void main(String[] args) throws IllegalAgeException {
        System.out.println("1. Age Validation using IllegalAgeException");
        try {
            CheckAge.ageValidation(17);
        } catch (IllegalAgeException e) {
            System.out.println("Error code: " + e.getErrorCode()); //AGE_NOT_VALID_01
            System.out.println("Details: " + e.getDetails());
            System.out.println("Original message: " + e.getOriginalMessage());
        }
    }
}
