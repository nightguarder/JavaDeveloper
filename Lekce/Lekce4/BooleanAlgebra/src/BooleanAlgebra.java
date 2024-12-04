public class BooleanAlgebra {
    public static class Booleans {
        int i;
        boolean a = true;
        boolean b = false;
    }
    public static void main(String[] args) throws Exception {
        Booleans booleans = new Booleans();
        //c = a && b
        System.out.println(booleans.a && booleans.b); //false

        //c = a || b
        System.out.println(booleans.a || booleans.b); //true

        //c = a && !b
        System.out.println(booleans.a && !booleans.b); //false

        //c = !(a && b)
        System.out.println(!(booleans.a && booleans.b)); //true
    }
}
