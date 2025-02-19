public class RegularBinSearch {
    //Array is sorted
    //Binary search (iterative)
    //https://www.youtube.com/watch?v=NFhOrxtXXcM
    private static int regularBinarySearch(int[] numbers, int key) {
        int low = 0; //start at the first element of the array
        int high = numbers.length - 1; //start at the last element of the array

        while (low <= high) { //keep going until the pointers cross
            //find the middle element
            int mid = (low + high) / 2; //average of low and high
            //what number is at that index?
            int midValue = numbers[mid];
            //check if it is equal to the key
            if (midValue == key) 
                return mid;
            if (key < midValue)
                high = mid - 1; //move the high pointer to the left
            else
                low = mid + 1; //move the low pointer to the right
        }
        return -1; //We didn't find the key
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 7, 9, 11};
        int key = 8;
        int res = regularBinarySearch(numbers, key);
        if (res == -1){
            System.out.println("Key not found");
            return;
        }
        System.out.println("Position of key: " + res);
        System.out.println("Number at position of key: "+ numbers[res]);
    }
}
    
