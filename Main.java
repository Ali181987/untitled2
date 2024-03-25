import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            int lowerLimit = scanner.nextInt();
            int upperLimit = scanner.nextInt();

            if (upperLimit <= lowerLimit) {
                System.out.println("Done");
                break;
            }

            int sumOfSquares = calculateSumOfSquares(lowerLimit, upperLimit);

            System.out.println("The sum of the squares from " + (lowerLimit * lowerLimit) + " to " + (upperLimit * upperLimit) + " is " + sumOfSquares);
        }

        scanner.close();
    }

    public static int calculateSumOfSquares(int lowerLimit, int upperLimit) {
        int sum = 0;
        for (int i = lowerLimit; i <= upperLimit; i++) {
            sum += i * i;
        }
        return sum;
    }

    }
