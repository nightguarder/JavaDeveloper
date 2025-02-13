import java.util.Random;

public class FindKeyArray {
    public static int findKey(int[] arr, int key) {
        int len = arr.length;
        for (int i = 0; i < len; i++) 
            if (arr[i] == key)
                return i;

        return -1; //nenalezen vrat -1
    }
    public static void main(String[] args) {
        System.out.println("Program k hledání náhodně vygenerovaného klíče v náhodném poli. (Luck)");
        int[] randomArr = new int[100];
        Random randIndex = new Random();

        //generate random array
        for (int i = 0; i < randomArr.length; i++) 
            randomArr[i] = randIndex.nextInt(100);
        System.out.println("Generovane pole: " + java.util.Arrays.toString(randomArr));
        
        //select key to find 
        int key = randIndex.nextInt(100);
        System.out.println("Klic ke hledání: " + key);

        int res = findKey(randomArr, key);
        if (res == -1) 
            System.out.println("Klic nenalezen");
        else 
            System.out.println("Klic nalezen na indexu: " + res);
        return ;
    }
    
}
