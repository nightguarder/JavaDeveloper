public class BMICalc {
    private String name;
    private int age;
    private double weight;
    private double height;

    //Osetreni vstupnich hodnot
    //Vyska nesmi byt mensi nez 0
    //Vaha nesmi byt mensi nez 0
    //Vek nesmi byt mensi nez 0 
    public BMICalc(String name, int age, double weight, double height) {
        if (age < 0) {
            throw new IllegalArgumentException("Věk nemůže být 0");
        }
        if (weight <= 0) {
            throw new IllegalArgumentException("Váha nesmi byt záporná");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Výška nesmi byt záporná");
        }
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public int getAge() {
        return age;
    }
    //Public metoda pro ziskani jmena
    public String getName() {
        return name;
    }
    
    //Vypocet BMI
    
    public double calculateBMI() {
        double bmi = weight / (height * height);
        return Math.round(bmi * 100.0) / 100.0; //Zaokrouhleni na 2 desetinna mista
    }
//Kategorie BMI
    public static String kategorie(double bmi) {
        if (bmi < 16.5) {
            return "těžká podvýživa";
        } else if (bmi >= 16.5 && bmi < 18.5) {
            return "podváha";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "ideální (zdravá) váha";
        } else if (bmi >= 25 && bmi < 30) {
            return "nadváha";
        } else if (bmi >= 30 && bmi < 35) {
            return "obezita prvního stupně";
        } else if (bmi >= 35 && bmi < 40) {
            return "obezita druhého stupně";
        } else {
            return "obezita třetího stupně (též morbidní obezita)";
        }
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Kalkulačka Vašeho BMI");
        BMICalc bmi = new BMICalc("Chris", 25, 63.5, 1.77); //Vytvoreni instance tridy BMI
        System.out.println(bmi.name + " Vaše bmi je " + bmi.calculateBMI());
        
        String bmikategorie = kategorie(bmi.calculateBMI());
        System.out.println(bmikategorie);
    }
}
