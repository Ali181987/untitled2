import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Simple Calculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exiting the program.");
                break;
            }

            double num1, num2;
            System.out.print("Enter first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Enter a number: ");
                scanner.next();
            }
            num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Enter a number: ");
                scanner.next();
            }
            num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero!");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select from 1 to 5.");
            }
        }

        scanner.close();
    }
}
