package Excercise5_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E501Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCpacity = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        while (!line.equals("end")) {


            if (line.contains("Add")) {
                String[] data = line.split(" ");
                train.add(Integer.parseInt(data[1]));
            } else {

                for (Integer wagon : train) {
                    int passengers = Integer.parseInt(line);
                    if (wagon + passengers <= maxCpacity) {
                        train.set(train.indexOf(wagon), wagon + passengers);
                        break;
                    }


                }


            }

            line = scanner.nextLine();

        }
        System.out.println(train.toString().replaceAll("[\\[\\],]", ""));

    }
}

