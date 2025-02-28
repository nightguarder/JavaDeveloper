import java.util.Arrays; // Import the Arrays class to store the memoization array

public class FibonacciDP {
    /**
     * https://www.baeldung.com/cs/fibonacci-top-down-vs-bottom-up-dynamic-programming
     * Computes the nth Fibonacci number using top-down dynamic programming (memoization).
     *
     * Time complexity: O(n)
     * Space complexity: O(n)
     * 
     */
    public static long fibonacciMemo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        // Handle base cases directly for clarity
        if (n == 0 || n == 1) {
            return n;
        }
        // Initialize memoization array to store computed values
        long[] memo = new long[n + 1];
        Arrays.fill(memo, -1); // Mark all values as "not computed"
        
        memo[0] = 0; // Base case: F(0) = 0
        memo[1] = 1; // Base case: F(1) = 1
        return fibonacciMemoHelper(n, memo);
    }

    // Recursive function to help with memoization
    private static long fibonacciMemoHelper(int n, long[] memo) {
        // If the value is already computed, return it
        if (memo[n] != -1) {
            return memo[n];
        }
        // Recursively compute and store the result in the memoization array
        memo[n] = fibonacciMemoHelper(n - 1, memo) + fibonacciMemoHelper(n - 2, memo);
        return memo[n];
    }
    public static void main(String[] args) {
        long start = System.nanoTime(); //Measure the time taken by the fibonacci() method
        System.out.println(fibonacciMemo(45)); //1134903170
        long end = System.nanoTime();
        System.out.println("Time taken: " + (end - start) + " ns"); //still slow

        //Increate number count < 100
        start = System.nanoTime(); //Measure the time taken by the fibonacci() method
        System.out.println(fibonacciMemo(100)); //354224848179261915075
        end = System.nanoTime();
        System.out.println("Time taken: " + (end - start) + " ns"); //should be fast
        
    }
}
    

