package com.cyrils.java.ukoly;
import java.util.List;
import java.util.stream.Collectors;

public class UnlimitedStream {

    public static void main(String[] args) {
        //generate unlimited numbers
        List <Long> numbers = NekonecnyStream.infiniteStream()
        .filter(n -> n % 4 == 0)
        .limit(100)
        .collect(Collectors.toList());
            
            System.out.println("Počet čísel ('prvků') v seznamu: " + numbers.size());
            //System.out.println("Prvních 100 čísel dělitelných 4:");

            /* numbers.stream().limit(100).forEach(n -> System.out.print(n + " "));
            System.out.println("..."); */

        //Test
        //Součet (Σ) 
        long sum = numbers.stream()
            .reduce(0l, (a, b) -> a + b); //pocatecni hodnota 0
        System.out.println("Součet prvních 100 čísel dělitelných 4: " + sum);

        //Součin (∏)
        //?ChatGPT
        //?there's a risk of integer overflow with large numbers. If this occurs, you might need to use BigInteger instead.
        long product = numbers.stream()
            .reduce(1l, (a, b) -> a * b); //pocatecni hodnota 1
        System.out.println("Součin prvních 100 čísel dělitelných 4: " + product);

        //Průměr (x̄)
        double average = numbers.stream()
            .collect(Collectors.averagingLong(n -> n));
        System.out.println("Průměr prvních 100 čísel dělitelných 4: " + average);
    }
}
