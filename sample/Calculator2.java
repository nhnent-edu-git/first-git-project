import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter an expression of the form 2 * 4");
            double a = scanner.nextDouble();
            String operation = scanner.next();
            double b = scanner.nextDouble();

            switch (operation)  {
            case "+":
                System.out.println((a + b));
                break;

            case "-":
                System.out.println((a - b));
                break;

            case "/":
                System.out.println((a / b));
                break;

            case "*":
                System.out.println((a * b));
                break;

            default:
            }
        }
    }
}
