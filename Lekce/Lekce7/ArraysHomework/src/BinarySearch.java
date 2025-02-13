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
        int mid = left + (right - left) / 2;
        //stred pole[100] = 0 + (100-0)/2 = 50
        //System.out.println("Posouvani na index(pivot): " + mid);

        //base case
        if (left > right)
            return -1; //klic nenalezen

        if (arr[mid] == key) //klic v stredu
            return mid; 
        if (arr[mid] > key) //klic je v levé polovine
            return binarySearch(arr, key, left, mid - 1);
        else if (arr[mid] < key) //klic je v prave polovine
            return binarySearch(arr, key, mid + 1, right); //
        else //klic je na stredu
            return mid; //klic nalezen na indexu
        
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
        int res = binarySearch(arraySorted, key, 0, arraySorted.length - 1);
        if (res == -1) 
            System.out.println("Klic nenalezen");
        else 
            System.out.println("Klic nalezen na indexu: " + res);
    }
}   
