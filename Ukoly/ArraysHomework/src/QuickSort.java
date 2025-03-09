public class QuickSort {
    //1. We choose an element from the list, called the pivot. We’ll use it to divide the list into two sub-lists.
    //2. We reorder all the elements around the pivot – the ones with smaller value are placed before it, and all the elements greater than the pivot after it. After this step, the pivot is in its final position. This is the important partition step.
    //3. We apply the above steps recursively to both sub-lists on the left and right of the pivot.
    public static int partition(int arr[], int left, int right) {
        int pivot = arr[left]; //choose the leftmost element as the pivot or rightmost element
        int i = left; //index pivotu

        //prochazeni pole
        for (int j = left + 1; j<= right; j++) { //od leveho + 1 do prava (vcetne)
            if (arr[j]<=pivot) { //pokud je prvek mensi nez pivot
                i++; //posun indexu
                //swap
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        //pivot je na indexu i
        int tmp = arr[i];
        arr[i] = arr[left];
        arr[left] = tmp;

        return i; //vrati index pivotu      
    }
    public static void quickSort(int arr[], int left, int right) {

        //base case 
        if (left < right) {
            //find the pivot
            int pivotIndx = partition(arr, left, right);

            //rekurzivni volani
            quickSort(arr, left, pivotIndx - 1); //sublist on the left
            quickSort(arr, pivotIndx + 1, right); //sublist 
        }

    }
    public static void main(String[] args) {
        int nonSortedArr[] = {11, 22, 43, 54, 6, 1, 0, 103, 22, 10};
        int result[] = new int[nonSortedArr.length]; //pole pro vysledek
        //zkopirujeme pole
        System.arraycopy(nonSortedArr, 0, result, 0, nonSortedArr.length);
        quickSort(result, 0, result.length - 1);
        
        System.out.println("Nesetridene Pole: " + java.util.Arrays.toString(nonSortedArr));
        System.out.println("Setridene Pole: " + java.util.Arrays.toString(result));
    
    }
}
