public class Methods {

    private double a;
    private double b;

    //Konstruktor není třeba návratový typ
    public Methods(double a, double b) {
        this.a = a;
        this.b = b;
    }
    //camelCase - název metody
    //static - metoda nepotřebuje instanci třídy
    //double - návratový typ
    static double sectiCisla(double a, double b) {
        if (a == 0 && b == 0) {
            System.out.println("Nelze sečíst nuly.");
            return 0;
        }
        return a + b; //vrací hodnotu ale neukládá ji
    }

    public static void sdilenaMetoda() {
        System.out.println("Toto je sdílená metoda. Přístupné z jakékoliv třídy.");
    }
    private static void privatniMetoda() {
        System.out.println("Toto je privátní metoda. Přístupné pouze z této třídy.");
    }

    //void - metoda nevrací hodnotu
    static void vypisCisla(double a, double b) {

        System.out.println(a + b);
    }

    static double vynasobCisla(double a, double b) {
        return a * b;
    }
    public static void main(String[] args) throws Exception {
        //Instance trídy Methods s konstruktorem
        //Methods m = new Methods(5, 10);
        //System.out.println(m.a);//5.0
        //System.out.println(m.b);//10.0

        //nebo lze použít statické metody
        vypisCisla(5,10);//15.0
        double secist = sectiCisla(1,3);
        System.out.println(secist);//4.0

        double vynasobit = vynasobCisla(3,4);
        System.out.println(vynasobit);//12.0

    }
}
