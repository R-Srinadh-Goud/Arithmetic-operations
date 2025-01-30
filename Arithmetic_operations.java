import java.util.Scanner;

public class Arithmetic_operations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");
        double a = in.nextDouble(), b = in.nextDouble();

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Division(Quotient ):" + (b != 0 ? (a / b) : "Cannot divide by zero"));

        in.close();
    }
}
