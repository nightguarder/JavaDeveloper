package com.cyrils.projects.maven;

import com.cyrils.java.lekce14.*;

public class Main {
    public static void main(String[] args) {
        //Test using the class from the other module
        try {
            CheckAge.ageValidation(20);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Hello world!");
    }
}