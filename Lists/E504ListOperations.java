package Excercise5_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class E504ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] data = line.split("\\s+");
            String command = data[0];
            switch (command) {
                case "Add":
                    numbers.add(Integer.parseInt(data[1]));
                    break;
                case "Insert":
                    int number = Integer.parseInt(data[1]);
                    int index = Integer.parseInt(data[2]);
                    if (index < 0 || index >= numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.add(index, number);
                    }

                    break;
                case "Remove":
                    index = Integer.parseInt(data[1]);
                    if (index < 0 || index >= numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(index);
                    }


                    break;
                case "Shift":
                    int count = Integer.parseInt(data[2]);
                    if (data[1].equals("left")) {
                        for (int i = 0; i < count; i++) {
                            numbers.add(numbers.get(0));
                            numbers.remove(0);
                        }
                    } else {
                        for (int i = 0; i < count; i++) {
                            numbers.add(0, numbers.get(numbers.size() -1));
                            numbers.remove(numbers.size() -1);
                        }

                    }
                    break;

            }


            line = scanner.nextLine();
        }

        numbers.forEach(el -> System.out.print(el + " "));
    }

}
