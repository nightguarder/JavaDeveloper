public class ArrayMinMax {
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
        System.out.println("Program to find largest and smallest integer in an array.");
        System.out.println("-------------------------------------------------");
        int[] SorterArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; //10 prvku
        int[] nonSortedArr = { 11, 22, 43, 54, 6, 1, 0, 103, 22, 10 }; //10 prvku

        System.out.println("Hledání prvků max a min v poli...");
        ArrayMinMax sample = new ArrayMinMax(); // vytvoreni instance tridy
        int result[] = new int[2];

        result = sample.findMinMax(SorterArr);
        System.out.println("Pole: " + java.util.Arrays.toString(SorterArr));
        System.out.println("Max: " + result[0] + ", Min: " + result[1]);

        result = sample.findMinMax(nonSortedArr);
        System.out.println("Pole: " + java.util.Arrays.toString(nonSortedArr));
        System.out.println("Max: " + result[0] + ", Min: " + result[1]);

        System.out.println("-------------------------------------------------");

    }
}
