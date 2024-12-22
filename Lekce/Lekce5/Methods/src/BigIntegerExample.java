import java.math.*;

public class BigIntegerExample {
    public static void main(String[] args) {
        // Using the Math.PI constant
        double radius = 5.0;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Circumference: %.4f%n", circumference); // 31.4159
        System.out.printf("Area: %.4f%n", area); // 78.5398
    }
}
