package Exercise3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E305TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = stringToIntArray(scanner);

        topIntegerCheck(intArray);


    }

    private static void topIntegerCheck(int[] intArray) {

        int checkedNum = 0;
        int count = 0;
        int position = 1;

        for (int i = 0; i < intArray.length - 1; i++) {

            checkedNum = intArray[i];
            position = 1 + i;
            count = 0;

            for (int j = 0; j < intArray.length - i - 1; j++) {

                if (checkedNum > intArray[position]) {

                    position++;
                    count++;

                } else {

                    position++;

                }

            }
            if (count == intArray.length - 1 - i) {
                System.out.print(checkedNum + " ");

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
