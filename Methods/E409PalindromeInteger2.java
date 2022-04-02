package Excercise4_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class E409PalindromeInteger2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            boolean isPalindrome = Arrays.equals(createArrayFromInput(input), reverseArray(createArrayFromInput(input)));

            if (isPalindrome) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }

    }

    private static int[] createArrayFromInput(String input) {
        int[] array = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();
        return array;
    }

    private static int[] reverseArray(int[] array) {

        int[] reverse = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - 1 - i];
        }

        return reverse;
    }

}







