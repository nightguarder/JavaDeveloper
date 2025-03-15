package com.cyrils.java.ukoly;

public class Lambdas {
    //use lambda expression to implement MatematickeOperace
    public static void main(String[] args) {
        System.out.println("Práce s lambdami a anonymními třídami");
     //inicializace
     MatematickeOperace scitani = (a, b) -> a + b;
     MatematickeOperace odcitani = (a, b) -> a - b;
     MatematickeOperace nasobeni = (a, b) -> a * b;  
     
     //Anonymni trida deleni
     MatematickeOperace deleni = new MatematickeOperace() {
         @Override
         public int apply(int a, int b) {
            //kontrola deleni nulou
            if (b == 0) {
                throw new IllegalArgumentException("Nelze delit nulou!");
            }
             return a / b;
         }
     };

     //Test
     System.out.println("1 + 2 = " + scitani.apply(1, 2));
     System.out.println("1 - 2 = " + odcitani.apply(1, 2));
     System.out.println("1 * 2 = " + nasobeni.apply(1, 2));
     System.out.println("1 / 2 = " + deleni.apply(1, 2));
     System.out.println("1 / 0 = " + deleni.apply(1, 0));
    }
}
