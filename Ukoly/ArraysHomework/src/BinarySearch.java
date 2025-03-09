import java.util.Random;

public class BinarySearch {
    //Binary search (recursive)
    //Baeldung: https://www.baeldung.com/java-binary-search
    //Předpokládejteže pole je seřazené od nejmenšího do největšího prvku.clea
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {// If any element is greater than the next, the array is not sorted
                return false;
            }
        }
        return true;
    }
    public static int binarySearch(int[] arr, int key, int left, int right) {
        //Recursive binary search
        if (left > right) //1. if the pointers cross
            return -1; //We didn't find the key
        //2. continue the search
        int mid = left + (right - left) / 2; //3. find the middle element
        //4. compare the key with the middle element
        if (key == arr[mid]) //4.1 if the key is equal to the middle element, return the index
            return mid;
        else if (key > arr[mid]) //4.2 if the key is greater than the middle element, go to the right
            return binarySearch(arr, key, mid + 1, right);
        else //4.3 if the key is less than the middle element, go to the left
            return binarySearch(arr, key, left, mid - 1);

    }
    public static void main(String[] args) {
        System.out.println("Program pro hledaní prvku v nahodnem poli pomoci Binárního Vyhledávacího stromu.");
        int[] array = new int[100];
        int[] arraySorted = new int[array.length];
        Random rand = new Random();

        //generate random array
        for (int i = 0; i < array.length; i++) 
            array[i] = rand.nextInt(100);
        System.out.println("Generovane pole: " + java.util.Arrays.toString(array));
        //generate random key to find
        int key = rand.nextInt(100);
        System.out.println("Klic ke hledání: " + key);

        if (!isSorted(array)) {
            System.out.println("Pole musí byt seřazené!");
            System.out.println("Serazuji....");
            //The sorting algorithm is a Dual-Pivot Quicksort 
            //or use your own sorting algorithm of choice
            //QuickSort.quickSort(array, 0, array.length - 1);
            java.util.Arrays.sort(array);
            System.arraycopy(array, 0, arraySorted, 0, array.length);
            System.out.println("Serazené pole: " + java.util.Arrays.toString(arraySorted));
        }
        //**left = 0, right = arraySorted.length - 1
        int res = binarySearch(arraySorted, key, 0, arraySorted.length - 1);
        if (res == -1) 
            System.out.println("Klic nenalezen");
        else 
            System.out.println("Klic nalezen na indexu: " + res);
    }
}   
