package com.cyrils.java.ukoly;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnlimitedStream {

    //use stream to generate unlimited numbers n%4 == 0
    public static void main(String[] args) {
        //generate unlimited numbers
        List <Integer> numbers = Stream.iterate(4, n -> n + 1) //vynechat 0
            .filter(n -> n % 4 == 0)
            .limit(100) //prvních 100
            .collect(Collectors.toList());
            
            System.out.println("Počet čísel v seznamu: " + numbers.size());
            //System.out.println("Prvních 100 čísel dělitelných 4:");

            /* for (Integer number : numbers) {
                System.out.println(number);
            } */

        /* //use fibonacci to generate unlimited numbers
        Stream.iterate(new int[] {0, 1}, n -> new int[] {n[1], n[0] + n[1]})
            .map(n -> n[0])
            .limit(10)
            .forEach(System.out::println); */

        //Test
        //Součet (Σ) 
        int sum = numbers.stream()
            .reduce(0, (a, b) -> a + b); //pocatecni hodnota 0
        System.out.println("Součet prvních 100 čísel dělitelných 4: " + sum);

        //Součin (∏)
        int product = numbers.stream()
            .reduce(1, (a, b) -> a * b); //pocatecni hodnota 1
        System.out.println("Součin prvních 100 čísel dělitelných 4: " + product);
        
        //Průměr (x̄)
        double average = numbers.stream()
            .mapToDouble(n -> n) //int -> double
            .average() //Returns and OptionalDouble describing the arithmetic mean of elements of this stream, or an empty optional if this stream is empty.
            .getAsDouble();
        System.out.println("Průměr prvních 100 čísel dělitelných 4: " + average);
    }
}
