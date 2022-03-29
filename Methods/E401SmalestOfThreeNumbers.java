package Excercise4_Methods;
import java.util.Arrays;
import java.util.Scanner;
public class E401SmalestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int minNum = printMinNum(num1, num2, num3);

        System.out.println(minNum);

    }

    private static int printMinNum(int num1, int num2, int num3) {
        int[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);
        return numbers[0];

        }

}

