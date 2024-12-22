public class OverloadMethods {

    //přetížené metody
    static double sectiCisla(double a, double b) {
        return a + b;
    }
    static double sectiCisla(double a, double b, double c) {
        return a + b + c;
    }
    //nebo s jiným datovým typem
    static int sectiCisla(int a, int b) {
        return a + b;
    }
    //Bohuzel nelze přetížit metodu jenom změnou návratového typu
    /* static int sectiCisla(double a, double b )  {
        return (int) (a + b);
    } */
    
}
