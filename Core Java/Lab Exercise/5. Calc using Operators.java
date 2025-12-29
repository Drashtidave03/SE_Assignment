import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        // Arithmetic Operators
        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;
        double quotient = (num2 != 0) ? (num1 / num2) : 0; // Prevent division by zero

        System.out.println("Sum: " + sum + " | Difference: " + diff);
        System.out.println("Product: " + prod + " | Quotient: " + quotient);

        // Relational Operators
        System.out.println("Is first number greater? " + (num1 > num2));
        System.out.println("Are numbers equal? " + (num1 == num2));
    }
}
