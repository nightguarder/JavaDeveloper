package com.cyrils.java.lekce4;
import java.util.Scanner;

public class LeapYear {
    public  boolean isLeapYear(int year) {
        // // Leap year logic:
        // 1. Divisible by 400, OR
        // 2. Divisible by 4 but NOT divisible by 100
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Rok "+year +" je přestupný");
            return true;
        }
        else {
            System.out.println("Rok "+year +" neni přestupný");
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Program pro zjištění, zda je zadaný rok přestupný");
        System.out.println("Zadejte rok: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close(); // zavři scanner

        LeapYear leapYear = new LeapYear();
        leapYear.isLeapYear(year); // zavolej metoduz pro kontrolu
        //2023
        //Rok 2023 neni přestupný
        //2000
        //Rok 2000 je přestupný
    }
}
