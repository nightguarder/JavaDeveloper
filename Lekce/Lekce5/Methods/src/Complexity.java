public class Complexity {
    //This is the exercise 2.3.2 from the book Computer Science An Interdisciplinary Approach by Sedgewick and Wayne:
    //Complexity - O(n)
    public static double lnFactorial(int n) {
        if (n == 1) return 0;
        return Math.log(n) + lnFactorial(n - 1);
    }
    //However, the recursive implementation of lnFibonacci() is not efficient because it recomputes the same values many times.
    //Complexity - O(2^n)
    public static double lnFibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return lnFibonacci(n - 1) + lnFibonacci(n - 2);
    }

    //rekurzivní metoda faktorialu
    static long factorial(int n) {
        if (n == 0 || n == 1) { //je n rovno 0 nebo 1?
            return 1; // ANO - vrátí 1
        }//NE - pokračuje
        return n * factorial(n - 1); //volání metody sama na sebe - sniž hodnotu n
    }
    //rekurzivní metoda Fibonacciho posloupnosti

    public static void main(String[] args) {
        /* System.out.println("Výpočet faktoriálu:");
        long vysledek = factorial(3);
        System.out.println(vysledek);//6 */

        //System.out.println("Výpočet ln faktoriálu:");
        //double vysledek = lnFactorial(10000); //works until 10000 fast
        //System.out.println(vysledek);
        /* System.out.println("Výpočet ln Fibonacciho posloupnosti:");
        double vysledek2 = lnFibonacci(45); //Takes a long time to compute for n > 40
        System.out.println(vysledek2); */
    }
    
}
