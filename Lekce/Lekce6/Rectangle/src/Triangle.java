public class Triangle {

    public static void fullTriangle(int size) {
        if (size <= 0) {
            System.out.println("Invalid input. Size must be greater than 0.");
            return;
        }
        else if (size >= Integer.MAX_VALUE) {
            System.out.println("Invalid input. Size must be less than INT_MAX.");
            return;
        }
        else {
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size - i; j++) { //leading spaces
                    System.out.print(' ');
                }
                for (int j = 0; j <=2*(i-1); j++) { //asterisks
                    System.out.print('*');
                }
                System.out.print('\n');
            }
        }
    }
    public static void rightTriangle(int size) {
        if (size <= 0) {
            System.out.println("Invalid input. Size must be greater than 0.");
            return;
        }
        else if (size >= Integer.MAX_VALUE) {
            System.out.println("Invalid input. Size must be less than INT_MAX.");
            return;
        }
        else {
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) { //leading spaces
                    System.out.print(' ');
                }
                for (int k = 1; k <= i; k++) { //asterisks
                    System.out.print('*');
                }
                System.out.print('\n');
            }
        }
    }
    public static void leftTriangle(int size) {
        if (size <= 0) {
            System.out.println("Invalid input. Size must be greater than 0.");
            return;
        }
        else if (size >= Integer.MAX_VALUE) {
            System.out.println("Invalid input. Size must be less than INT_MAX.");
            return;
        }
        else {
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) { 
                if (j<= size - i) { //left part of the triangle

                    System.out.print(' ');
                }
                else {
                    System.out.print('*');
                }
            }
            System.out.print('\n');
        }
        }

    }

    public static void main(String[] args) {
        System.out.println("Triangle");
        //Call the print * method
        //leftTriangle(5);
        //rightTriangle(5);
        fullTriangle(5);
    }
    
}
