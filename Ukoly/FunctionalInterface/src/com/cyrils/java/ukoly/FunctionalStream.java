package com.cyrils.java.ukoly;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalStream {

    // Use BigInteger to avoid integer overflow
    @FunctionalInterface
    interface BigIntegerOperation {
        BigInteger run(List<Long> numbers);
    }

    //use stream to generate unlimited numbers n%4 == 0
    public static void main(String[] args) {
        //generate unlimited numbers
        List <Long> numbers = NekonecnyStream.infiniteStream()
            .filter(n -> n % 4 == 0)
            .limit(100)
            .collect(Collectors.toList());
            
            System.out.println("Počet čísel v seznamu: " + numbers.size());
            //System.out.println("Prvních 100 čísel dělitelných 4:");

        // Print first 100 to verify what we're working with
        numbers.stream().limit(100).forEach(n -> System.out.print(n + " "));
            System.out.println("...");

        //Test
        //Součet (Σ) 
        StreamInterface sum = list -> list.stream().mapToInt(Long::intValue).sum();
        System.out.println("Součet (Σ): " + sum.run(numbers));

        //Součin (∏)
        // Fix: Change the interface to work with BigInteger to avoid integer overflow
        BigIntegerOperation product = list -> {
            BigInteger result = BigInteger.ONE;
            for (Long num : list) {
                result = result.multiply(BigInteger.valueOf(num));
            }
            return result;
        };
        System.out.println("Součin (∏): " + product.run(numbers));
        
        //Průměr (x̄)
        StreamInterface average = list -> (int) list.stream().mapToInt(Long::intValue).average().orElse(0);
        System.out.println("Průměr (x̄): " + average.run(numbers));
    }
}
