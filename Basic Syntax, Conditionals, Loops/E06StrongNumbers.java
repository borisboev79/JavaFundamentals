package Exercise1;

import java.util.Scanner;

public class E06StrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int inputNumber = Integer.parseInt(input);
        int number = inputNumber;
        int factorialSum = 0;
        for (int i = 0; i < input.length(); i++) {
            int digit = number % 10;
            number /= 10;
            int factorial = 1;
            for (int j = 1; j <= digit; j++) {
                factorial = factorial * j;

            }
            factorialSum += factorial;

        }
        if (factorialSum == inputNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}
