package com.cyrils.java.lekce14;

import com.cyrils.java.lekce4.LYImproved;

public class CheckLeapYear {
    public static void main(String[] args) {
        int year = 2000;
        // Valid year (within range)
        System.out.println(year + " is leap: " + LYImproved.isLeapYear(year)); // true
        
        // Invalid year (outside range)
        try {
            LYImproved.isLeapYear(1850);
        } catch (InvalidYearException e) {
            System.out.println("Error: " + e.getMessage()); // Error message printed
        }
    }
}
