import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter an expression of the form 2 * 4");
            double number1 = scanner.nextDouble();
            String operation = scanner.next();
            double number2 = scanner.nextDouble();

            switch (operation)  {
            case "+":
                System.out.println("Answer : " + number1 + " + " + number2 + " = " + (number1 + number2));
                break;

            case "-":
                System.out.println("Answer : " + number1 + " - " + number2 + " = " + (number1 - number2));
                break;

            case "/":
                System.out.println("Answer : " + number1 + " / " + number2 + " = " + (number1 / number2));
                break;

            case "*":
                System.out.println("Answer : " + number1 + " * " + number2 + " = " + (number1 * number2));
                break;

            default:
            }
        }
    }
}
