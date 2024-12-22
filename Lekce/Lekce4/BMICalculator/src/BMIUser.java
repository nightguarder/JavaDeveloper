import java.util.Scanner;

public class BMIUser {
    
    public static void main(String[] args) {
        System.out.println("Kalkulačka Vašeho BMI");
        System.out.println("Zadejte své jméno: ");
        Scanner sc = new Scanner(System.in); //Open scanner
        String name = sc.nextLine();
        System.out.println("Zadejte svůj věk: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Zadejte svoji váhu ve formátu(63.2) v kg: ");
        double weight = sc.nextDouble();
        sc.nextLine();
        System.out.println("Zadejte svoji výšku ve formátu(1.77) vcm: ");
        double height = sc.nextDouble();
        sc.nextLine();
        //close scanner
        sc.close();
        BMICalc bmi = new BMICalc(name, age, weight, height); //Vytvoreni instance tridy BMI
        System.out.println(bmi.getName() + " Vaše bmi je " + bmi.calculateBMI());
        
    }
    
}
