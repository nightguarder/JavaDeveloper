package com.cyrils.java.ukoly;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OsobaFilter {
    public static void main(String[] args) throws Exception {
        //List s osoby
        List<Osoba> osoby = new ArrayList<>();
        osoby.add(new Osoba("Petr", 18));
        osoby.add(new Osoba("Marie", 30));
        osoby.add(new Osoba("Petr", 45));
        osoby.add(new Osoba("Tomáš", 27));
        osoby.add(new Osoba("Michal", 22));

        //use stream to filter osoby > 25
        /* osoby.stream()
            .filter(osoba -> osoba.getVek() >= 25)
            .forEach(osoba -> System.out.println(osoba.getJmeno() + " " + osoba.getVek()));
         */
        //save to List
        List<Osoba> osoby_filtered = osoby.stream()
        .filter(osoba -> osoba.getVek() >= 25)
        .collect(Collectors.toList()); //use collect to save to List

        System.out.println("Osoby starsi nez 25 let:");
        for (Osoba osoba : osoby_filtered) {
            System.out.println(osoba.getJmeno() + " " + osoba.getVek());
        }

    }
}
