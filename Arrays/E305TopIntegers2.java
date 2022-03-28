package Exercise3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E305TopIntegers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = stringToIntArray(scanner);

        topIntegerCheck(intArray);

    }

    private static void topIntegerCheck(int[] intArray) {

            for (int i = 0; i < intArray.length - 1; i++) {

            for (int j = i + 1; j < intArray.length; j++) {

                if (intArray[i] <= intArray[j]) {

                    break;
                }
                if (j == intArray.length - 1) {

                    System.out.print(intArray[i] + " ");
                }
            }
        }
                System.out.print(intArray[intArray.length - 1]);
            System.out.println();
        }

    private static int[] stringToIntArray(Scanner scanner) {

        int[] intArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        return intArr;
    }

}
