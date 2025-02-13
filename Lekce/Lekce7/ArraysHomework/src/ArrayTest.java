import java.util.Arrays;
//NENÍ MOJE TVORBA
public class ArrayTest {

    // Sequential version to find min and max
    public int[] findMinMaxSequential(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        return new int[]{max, min};
    }

    // Parallel version to find min and max
    public int[] findMinMaxParallel(int[] array) {
        int max = Arrays.stream(array).parallel().max().getAsInt();
        int min = Arrays.stream(array).parallel().min().getAsInt();
        return new int[]{max, min};
    }

    public static void main(String[] args) throws Exception {
        ArrayTest sample = new ArrayTest();
        
        // Try different array sizes
        int[] arraySizes = {100, 1000, 10000, 100000, 1000000};
        
        for (int size : arraySizes) {
            int[] testArray = generateRandomArray(size);

            // Warm-up period: Run for 2-5 seconds before measuring the performance
            System.out.println("Array size: " + size);

            // Warm-up runs (ignore these)
            for (int i = 0; i < 5; i++) {
                sample.findMinMaxSequential(testArray); // Warm-up sequential
                sample.findMinMaxParallel(testArray);   // Warm-up parallel
            }

            // Repetitive Test runs to measure the actual performance
            long startTime = System.nanoTime();
            for (int i = 0; i < 100; i++) {  // Run 100 iterations to average results
                sample.findMinMaxSequential(testArray);
            }
            long endTime = System.nanoTime();
            long durationSequential = (endTime - startTime);

            startTime = System.nanoTime();
            for (int i = 0; i < 100; i++) {  // Run 100 iterations for parallel test
                sample.findMinMaxParallel(testArray);
            }
            long endTimeParallel = System.nanoTime();
            long durationParallel = (endTimeParallel - startTime);

            // Print average results (avoiding IO interference in measurement)
            System.out.println("Sequential Time: " + durationSequential / 100 + " ns (avg per run)");
            System.out.println("Parallel Time: " + durationParallel / 100 + " ns (avg per run)");
            System.out.println("-------------------------------------------------");
        }
    }

    // Helper method to generate a random array of a given size
    //Math.rando() not safe for multi-threading since it relies on java.util.Random
    //https://stackoverflow.com/questions/41380318/why-is-parallel-stream-slower
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }
}
