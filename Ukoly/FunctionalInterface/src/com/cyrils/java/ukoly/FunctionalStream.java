package com.cyrils.java.ukoly;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalStream {

    // Use BIgInteger to avoid integer overflow
    @FunctionalInterface
    interface BigIntegerOperation {
        BigInteger compute(List<Integer> numbers);
    }

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

        //Test
        //Součet (Σ) 
        StreamInterface sum = list -> list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Součet (Σ): " + sum.run(numbers));

        //Součin (∏)
        //?ChatGPT:
        //?there's a risk of integer overflow with large numbers. If this occurs, you might need to use BigInteger instead.
        /* StreamInterface product = list -> list.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Součin (∏): " + product.run(numbers)); */
        BigIntegerOperation product = list -> list.stream().map(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
        System.out.println("Součin (∏): " + product.compute(numbers));
        //Průměr (x̄)
        StreamInterface average = list -> (int) list.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Průměr (x̄): " + average.run(numbers));
    }
}
