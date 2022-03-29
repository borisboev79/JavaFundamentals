package Exercise3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E306EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = stringToIntArray(scanner);
        equalSums(intArray);


    }

    private static void equalSums(int[] intArray) {

        int leftSum = 0;
        int rightSum = 0;
        int trueIndex = -1;

        for (int i = 0; i < intArray.length; i++) {

            for (int j = 0; j < i; j++) {

                if (i > 0) {

                    leftSum += intArray[j];

                }
            }
            for (int j = i + 1; j < intArray.length; j++) {

                if (i < intArray.length - 1) {

                    rightSum += intArray[j];
                }
            }

            if (leftSum == rightSum) {

                trueIndex = i;

            }

            leftSum = 0;
            rightSum = 0;

        }
        if(trueIndex != -1){

            System.out.println(trueIndex);

        }else{

            System.out.println("no");

        }


    }

    private static int[] stringToIntArray(Scanner scanner) {

        int[] intArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        return intArr;
    }
}
