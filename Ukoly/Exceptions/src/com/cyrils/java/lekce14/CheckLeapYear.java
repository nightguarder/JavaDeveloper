package com.cyrils.java.lekce14;

import com.cyrils.java.lekce4.LYImproved;

public class CheckLeapYear {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeap = LYImproved.isLeapYear(year); // Use the imported class
        System.out.println(year + " is leap? " + isLeap);
    }
}
