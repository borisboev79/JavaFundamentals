package Excercise5_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E505BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int[] bombPower = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int bomb = bombPower[0];
        int power = bombPower[1];
        while (numbers.contains(bomb)) {
            int bombIndex = numbers.indexOf(bomb);
            int start = bombIndex - power;
            int end = bombIndex + power;
            if (start < 0) {
                start = 0;
            }
            if (end >= numbers.size()) {
                end = numbers.size() - 1;
            }
            for (int i = start; i <= end; i++) {
                numbers.remove(start);


            }

        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
