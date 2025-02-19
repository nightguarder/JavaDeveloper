public class RecursiveBinSearch {
    //Array is sorted
    //Binary search (recursive)
    //https://www.youtube.com/watch?v=NFhOrxtXXcM
    private static int recursiveBinarySearch(int[] numbers, int key, int low, int high) {
        if (high >= low && low < numbers.length - 1) { //keep going until the pointers cross
            //find the middle element
            int mid = (low + high) / 2; 
            //what number is at that index?
            int midValue = numbers[mid];
            //check if it is equal to the key
            if (midValue == key)
                return mid; //found the key at the index
            if (key < midValue)
                return recursiveBinarySearch(numbers, key, low, mid - 1); //move the high pointer to the left    
            else
                return recursiveBinarySearch(numbers, key, mid + 1, high); //move the low pointer to the right
        }
        return -1; //We didn't find the key
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 7, 9, 11};
        int key = 7;
        int res = recursiveBinarySearch(numbers, key, 0, numbers.length - 1);
        if (res == -1){
            System.out.println("Key not found");
            return;
        }
        System.out.println("Position of key: " + res);
        System.out.println("Number at position of key: "+ numbers[res]);
    }
}
