package Excercise4_Methods;

import java.util.Scanner;

public class E405AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());

        }

        System.out.println(sum(numbers) - subtract(numbers));

    }

    private static int sum(int[] numbers) {
        return numbers[0] + numbers[1];
    }

    private static int subtract(int[] numbers) {
        return numbers[2];
    }
}
