package com.cyrils.java.lekce14;

public class CheckLeapYear {
    
    public static void isYearLeap(int year) throws InvalidYearException {
        if (year < 1900 || year > 2100) {
            throw new InvalidYearException("Neplatný rok: " + year,  //message
            "YEAR_NOT_VALID_01", //code
            "Year validation failed - year must be between 1 and 9999"); //details
        }
        else
            System.out.println("No exceptions thrown");
    }
}
