package com.cyrils.java.lekce14;

public class CheckLeapYear {
    
    public static void isYearLeap(int year) throws InvalidYearException {
        if (year < 1900 || year > 2100) {
            throw new InvalidYearException("Zadaný rok je neplatný: " + year); //metoda vyhodí výjimku
        }
        else
            System.out.println("No exceptions thrown");
    }
}
