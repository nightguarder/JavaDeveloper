package com.cyrils.java.lekce14;
//vlastni trida pro kontrolu veku
public class CheckAge {
    /**
     * Kontroluje zda je věk vyšší nebo roven 18 let
     * @param age věk k ověření
     * @throws IllegalAgeException pokud je věk nižší než 18
     */
    public static boolean ageValidation(int age) throws IllegalAgeException {
        if (age < 18) 
            throw new IllegalAgeException("Věk " + age + " je pod hranicí 18 let"); //vyhození výjimky
        else
            System.out.println("Věk " + age + " je v pořádku");
        return true;
    }
    
}
