package com.cyrils.java.lekce14;

import com.cyrils.java.lekce4.LYImproved;

public class CheckLeapYear {
    
    public static void isYearLeap(int year) throws InvalidYearException {
        if (year < 1900 || year > 2100) {
            throw new InvalidYearException("Neplatný rok: " + year + ". Povolený rozsah 1900-2100");
        }
        else
            System.out.println("No exceptions thrown");
    }
}
