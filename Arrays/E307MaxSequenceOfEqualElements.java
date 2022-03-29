package Exercise3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E307MaxSequenceOfEqualElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] intArray = stringToIntArray(scanner);
        maxSequence(intArray);


    }

    private static void maxSequence(int[] intArray) {

        String output = "";
        String tempOutput = "";
        int counter = 0;
        int tempCounter = 0;

        for (int i = intArray.length - 1; i > 0; i--) {

            if (output.equals("")) {

                output = intArray[i] + " ";

            }
            if (intArray[i] == intArray[i - 1]) {

                counter++;
                output += intArray[i] + " ";

            } else {
                if (counter >= tempCounter) {
                    tempOutput = output;
                    tempCounter = counter;

                }

                output = "";
                counter = 0;

            }

        }
        if(tempCounter > counter) {
            System.out.println(tempOutput);
        }
        else{
            System.out.println(output);
        }
    }

    private static int[] stringToIntArray(Scanner scanner) {

        int[] intArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        return intArr;
    }
}
