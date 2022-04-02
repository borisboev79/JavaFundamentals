package Excercise4_Methods;

import java.util.Scanner;

public class E408FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNumber = scanner.nextLong();
        long secondNumber = scanner.nextLong();

        double result = (double) factorialCalc(firstNumber) / (double) factorialCalc(secondNumber);

        System.out.printf("%.2f", result);
    }

    private static long factorialCalc(long number) {
        if (number == 0) {
            return 1;
        } else {
            long[] array = new long[(int) number];
            for (int i = 0; i < number; i++) {
                array[i] = number - i;
            }
            long factorial = 1;
            for (int i = 0; i < array.length; i++) {
                factorial += factorial * i;
            }
            return factorial;

        }
    }
}
