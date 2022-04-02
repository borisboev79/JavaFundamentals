package Excercise4_Methods;

import java.util.Scanner;
import java.util.Arrays;

public class E410TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= inputNum; i++) {

            if (divByEight(i) && containsOdd(i)) {
                System.out.println(i);
            }

        }

    }


    private static boolean divByEight(int num) {
        int sum = 0;
        String line = String.valueOf(num);
        int[] digits = Arrays.stream(line.split("")).mapToInt(Integer::parseInt).toArray();

        for (int digit : digits) {
            sum += digit;
        }

        if (sum % 8 == 0) {
            return true;


        } else {
            return false;

        }
    }


    private static boolean containsOdd(int num) {
        String line = String.valueOf(num);
        int[] digits = Arrays.stream(line.split("")).mapToInt(Integer::parseInt).toArray();

        for (int digit : digits) {

            if (digit % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}

