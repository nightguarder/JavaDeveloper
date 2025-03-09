package com.cyrils.java.lekce14;
public class Main {
    //main method
    public static void main(String[] args) throws IllegalAgeException, InvalidYearException {
        System.out.println("1. Age Validation using exception IllegalAgeException");
        try {
            CheckAge.ageValidation(17); //throws exception
        } catch (IllegalAgeException e) {
            System.out.println("Error code: " + e.getErrorCode());
        }
        System.out.println("\n");
        System.out.println("2. Year Validation using runtime InvalidYearException");
        try {
            CheckLeapYear.isYearLeap(2500); //throws exception
        } catch (InvalidYearException e) {
            System.out.println("Error code: " + e.getErrorCode()); //YEAR_NOT_VALID
            System.out.println("Details: " + e.getDetails());
            if (e.isRecoverable()) {
                System.out.println("Recoverable error, try again.");
            } else {
                System.out.println("Unrecoverable error, exiting.");
            }
        }
    }
}
