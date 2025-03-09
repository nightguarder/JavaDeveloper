package com.cyrils.java.lekce14;
//vlastni trida pro kontrolu veku
public class CheckAge {
    /**
     * Kontroluje zda je věk vyšší nebo roven 18 let
     * @param age věk k ověření
     * @throws IllegalAgeException pokud je věk nižší než 18
     */
    public static void ageValidation(int age) throws IllegalAgeException {
        if (age < 18) 
            throw new IllegalAgeException("Vek musi byt vetsi nez 18");
        else
            System.out.println("No exceptions thrown");
    }
    
}
