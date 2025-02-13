public class FindSumAvgMed {
    //- Vrátí součet, půměr, medián všech prvků pole.
    //Pole neni treba tridit pokud nalezneme nejmensi prvek a nejvetsi prvek

    public static double[] FindSumAvgMed(int arr[]){
        int len = arr.length;
        //System.out.println("Pocet prvku v poli: " + len);
        double sum = 0;
        double avg = 0;
        double med = 0;
        //soucet vsech prvku
        for (int i = 0; i < len; i++) {
            sum += arr[i];
        }
        //prumer vsech prvku v poli
        avg = sum / len; //double / int = double
        //System.out.println("Prumer vsech prvku: " + avg);
        med =  FindMedian(arr);
        System.out.println("Median: " + med);
        return new double[] {sum, avg, med};
    }

    //Rearange the array so that all elements less than the pivot are on the left side of the pivot
    //similar to quicksort
    public static int partition(int arr[], int left, int right) {
        int pivot = arr[left]; //choose the leftmost element as the pivot or rightmost element
        int i = left; //index pivotu

        //prochazeni pole
        for (int j = left + 1; j <= right; j++) { //od leveho + 1 do prava (vcetne)
            if (arr[j]<=pivot) {
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
    
   //recursively find the nth element in the array
   //same as quicksort
    public static int quickNthEl(int arr[], int left, int right, int n){
        //base case
        if (left == right) 
            return arr[left];
        
        //rekurzivni volani
        int pivotIndx = partition(arr, left, right); //pivot je na indexu i
        //System.out.println("Pivot: " + pivotIndx);
        //Podobne k quicksortu
        if (n == pivotIndx) //n je na indexu pivotIndx
            return arr[pivotIndx];
        else if (n < pivotIndx) 
            return quickNthEl(arr, left, pivotIndx - 1, n);
        else 
            return quickNthEl(arr, pivotIndx + 1, right, n);
        

    }
    public static double FindMedian(int arr[]){
        int n = arr.length;
        int medianIndx = n / 2;
        if (n % 2 == 0) //n je sudy
            return (double) (quickNthEl(arr, 0, n - 1, medianIndx - 1) + quickNthEl(arr, 0, n - 1, medianIndx)) / 2;
        else //n je lichy
            return (double) quickNthEl(arr, 0, n - 1, medianIndx);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int nonSortedArr[] = {11, 22, 43, 54, 6, 1, 0, 103, 22, 10};
        double array[] = {3.14159, 1.112345, 3.3333, 4.44, 5.5};
        double[] result = FindSumAvgMed(arr);
        System.out.println("Soucet: " + result[0] + ", Prumer: " + result[1] + ", Median: " + result[2]);
    }
    
}
