package Excercise4_Methods;

import java.util.Scanner;
import java.util.Arrays;

public class E411ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];

            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(commandLine[1]);
                    if (isValidIndex(index, arr.length)) {
                        arr = exchange(arr, index);
                        for (int i = 0; i < arr.length; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;
                case "max":
                    if (commandLine[1].equals("even")) {

                    }else{

                    }
                    break;
                case "min":
                    if (commandLine[1].equals("even")) {

                    }else{

                    }
                        break;
                        case "first":
                            if (commandLine[1].equals("even")) {

                            }else{

                            }
                                break;
                                case "last":
                                    if (commandLine[1].equals("even")) {
                                        break;
                                    }
                            }
                        input = scanner.nextLine();
                    }

        }


    public static int[] exchange(int[] array, int index) {
        int[] first = new int[index + 1];
        int[] second = new int[array.length - index - 1];

        for (int i = 0; i <= index; i++) {
            first[i] = array[i];

        }
        for (int i = 0; i < second.length; i++) {
            second[i] = array[index + 1 + i];
        }
        int[] resultArr = new int[array.length];
        for (int i = 0; i < resultArr.length - first.length; i++) {
            resultArr[i] = second[i];
        }
        for (int i = 0; i < resultArr.length - second.length; i++) {
            resultArr[i + second.length] = first[i];
        }

        return resultArr;
    }

    public static boolean isValidIndex(int index, int length) {
        return index >= 0 && index < length;
    }
}