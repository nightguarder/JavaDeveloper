public class Fibonacci {
    //https://cs.wikipedia.org/wiki/Fibonacciho_posloupnost
    //Fibonacciho posloupnost je posloupnost čísel, kde každé číslo je součtem dvou předchozích čísel.
    //F(0) = 0, F(1) = 1
    //F(n) = F(n-1) + F(n-2)
    //kvůli hromadícím se nepřesnostem při výpočtu za použití čísel s plovoucí řádovou čárkou je pro větší n nepoužitelná.
    private static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    //Fibonnaci sequence using memorization
    //NENI MOJE TVORBA
    //https://stackoverflow.com/questions/39839640/java-fibonacci-sequence-fast-method
    //Complexity - O(n)
    private static long fibonacciMem(int n) {
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n+1];
        int i;
        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <= n; i++) {
            /* Add the previous 2 numbers in the series
            and store it */
            f[i] = f[i-1] + f[i-2];
        }
        return f[n]; //Return the nth Fibonacci number

    }

    public static void main(String[] args) {
        //Measure the time taken by the fibonacci() method
        long startTime1 = System.nanoTime();
        fibonacci(10);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        System.out.println("Time taken: " + duration1 + " nanoseconds");

        //Measure the time taken by the fibonacciMem() method
        long startTime = System.nanoTime();
        fibonacciMem(10);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time taken: " + duration + " nanoseconds");
        /* Time taken: 7459 nanoseconds
            Time taken: 1833 nanoseconds */
            //Mnohem rychlejsi jelikoz nepocita stejne hodnoty znovu
    }
    
}
