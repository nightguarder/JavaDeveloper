public class Operands {
    //edit proměnných
    public class variables {
        int a = 10;
        int b = 20;
    }

    public void check(int a , int b) {
        if (a > b) {
            System.out.println("a is greater than b");
        }
        else if (a < b) {
            System.out.println("a is less than b");
        }
        else if (a == b) {
            System.out.println("a is equal to b");
        }
        else if (a != b) {
            System.out.println("a is not equal to b");
        }
        else {
            System.out.println("Invalid input");
        }
    }
    public static void main(String[] args) throws Exception {
        Operands obj = new Operands();
        obj.check(20, 30);
    }
}
