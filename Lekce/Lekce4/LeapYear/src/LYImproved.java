import java.util.Scanner;

public class LYImproved {
    //Time complexity: O(1)
    public static boolean isLeapYear(int year) {
        // Leap year logic:
        // 1. Divisible by 400, OR
        // 2. Divisible by 4 but NOT divisible by 100
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0); 
    }
    public static void main(String[] args) {
        System.out.println("Program pro zjištění, zda je zadaný rok přestupný. (např. 2000, 2020, 2024 nebo -43 (př. n. l.))");
        System.out.println("Zadejte rok: ");
        // try-with-resources block automatically closes the Scanner
        try (Scanner sc = new Scanner(System.in)) {
            int year = Integer.parseInt(sc.nextLine()); // Read the input as a string and then parse it as an integer

            String message = (year < -238) 
                ? "Historie přestupných roků sahá pouze do roku 238 př. n. l."
                : (isLeapYear(year) ? "Rok " + year + " je přestupný" : "Rok " + year + " neni přestupný"); 

            System.out.println(message);

        } catch (NumberFormatException e) {
            System.out.println("Neplatný vstup! " + e.getMessage());
        }
    }
    
}
