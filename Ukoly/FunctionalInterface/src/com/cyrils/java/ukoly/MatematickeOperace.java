package com.cyrils.java.ukoly;

//Rozhraní, které obsahuje pouze jednu abstraktní metodu ale, může obsahovat více defaultních metod
@FunctionalInterface
public interface MatematickeOperace {
    //s parametry a navratovym typem
    abstract int apply (int a, int b);

    //defaultni metoda
    default void print() {
        System.out.println("Toto je rozhraní @FunctionalInterface pro matematické operace");
    }
    
}
