public class Compare {
    public static class Variables {
        int a = 10;
        int b = 15;

        int c = 100;
        double d = 100.11;
    }

    public static void main (String[] args) {
        Variables variables = new Variables();

        System.out.println("a = " + variables.a + " b = " + variables.b);
        // a == b
        System.out.println(variables.a == variables.b); //false

        // a <= b
        System.out.println(variables.a <= variables.b); //true

        // a >= b
        System.out.println(variables.a >= variables.b); //false


        //*POZOR změna* */
        variables.a = 11;
        variables.b = 11;

        System.out.println("a = " + variables.a + " b = " + variables.b); 

        //a <= b
        System.out.println(variables.a <= variables.b); //true

        //a < b
        //vyjde false jelikož a == b
        System.out.println(variables.a < variables.b); //false

        if (variables.a < variables.b){
            System.out.println("A je rovno B");
        }else {
            System.out.println("A neni rovno B");
        }

        if ((variables.a == variables.b) && (variables.c < variables.d)){
            System.out.println("A je rovno B a C je mensi nez D");
        }
        else {
            System.out.println("A neni rovno B a C je vetsi nez D");
        }

        //Zkracene vyhodnocovani: 
        //Nejprve se vyhodnotí b!=0
        //pokracuje se v dalsim vyhodnocovani
        //usetrime tak dvojite vyhodnocovani a zvysime efektivitu
        if (variables.b !=0 && ((variables.a / variables.b) < 10))  {
            System.out.println("variables.b !=0 && ((variables.a / variables.b) < 10) ==> true");
        }  else{
            System.out.println("variables.b !=0 && ==> false"); 
        }
    }
}
