public class BMI {
    private String name;
    private double weight;
    private double height;

    //Osetreni vstupnich hodnot
    //Vyska nesmi byt mensi nez 0
    //Vaha nesmi byt mensi nez 0
    //Vek nesmi byt mensi nez 0 
    public BMI(String name, int age, double weight, double height) {
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
        this.weight = weight;
        this.height = height;
    }
    
    //Vypocet BMI
    //TODO: Round to 2 decimal places
    public double calculateBMI() {
        return weight / (height * height);
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
        BMI bmi = new BMI("Chris", 25, 63, 1.77); //Vytvoreni instance tridy BMI
        System.out.println(bmi.name + " Vaše bmi je " + bmi.calculateBMI());
        
        String bmikategorie = kategorie(bmi.calculateBMI());
        System.out.println(bmikategorie);
    }
}
