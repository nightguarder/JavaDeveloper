import java.util.Arrays;
//NENI MOJE TVORBA
public class ArrayFaster {
    public int[] paralellMaxMin(int[] arr) {
        int[] result = new int[2];
        result[0] = Arrays.stream(arr).parallel().max().getAsInt();
        result[1] = Arrays.stream(arr).parallel().min().getAsInt();
        return result;
    }
    //Array method - returns 2 integers, max and min
    public int[] findMinMax(int[] arr) {
        int len = arr.length;
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < len; i++) {
            if (arr[i] < min) 
                min = arr[i];
            if (arr[i] > max) 
                max = arr[i];
        }
        return new int[] { max, min}; // vrati pole s dvema hodnotami
    }
    public static void main(String[] args) throws Exception {
        //Pomalejší jak ArraySample? 
        System.out.println("Program to find largest and smallest integer in an array.");
        int[] SorterArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
        int[] nonSortedArr = { 11, 22, 43, 54, 6, 1, 0, 103, 22, 10, 200, 555, 444, 333, 222, 111, 999, 888, 777, 666 }; //non sorted array

        ArrayFaster sample = new ArrayFaster(); // vytvoreni instance tridy
        //Add timing here
        long startTime = System.nanoTime();
        int[] result = sample.paralellMaxMin(SorterArr); //uloz vysledky
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Pole: " + java.util.Arrays.toString(SorterArr));
        System.out.println("Max: " + result[0] + ", Min: " + result[1]);
        System.out.println("Čas na hledání (Parallel): " + duration + " nanoseconds");

        startTime = System.nanoTime();
        result = sample.paralellMaxMin(nonSortedArr); //pozor prepsani vysledku
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Pole: " + java.util.Arrays.toString(nonSortedArr));
        System.out.println("Max: " + result[0] + ", Min: " + result[1]);
        System.out.println("Čas na hledání: (Parallel) " + duration + " nanoseconds");

        startTime = System.nanoTime();
        result = sample.findMinMax(nonSortedArr); //pozor prepsani vysledku
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Pole: " + java.util.Arrays.toString(nonSortedArr));
        System.out.println("Max: " + result[0] + ", Min: " + result[1]);
        System.out.println("Čas na hledání: (Sequential) " + duration + " nanoseconds");

        startTime = System.nanoTime();
        result = sample.findMinMax(SorterArr); //uloz vysledky
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Pole: " + java.util.Arrays.toString(SorterArr));
        System.out.println("Max: " + result[0] + ", Min: " + result[1]);
        System.out.println("Čas na hledání (Sequential): " + duration + " nanoseconds");
    }
}
