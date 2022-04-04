package Excercise5_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E506CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        for (int i = 0; i < firstPlayer.size(); i++) {
            if (firstPlayer.get(i) > secondPlayer.get(i)) {
                firstPlayer.add(firstPlayer.get(i));
                firstPlayer.add(firstPlayer.size() -1, secondPlayer.get(i));
                firstPlayer.remove(i);
                secondPlayer.remove(i);
                i--;
                if(secondPlayer.isEmpty()){
                    break;
                }
            } else if (secondPlayer.get(i) > firstPlayer.get(i)) {
                secondPlayer.add(secondPlayer.get(i));
                secondPlayer.add(secondPlayer.size() -1, firstPlayer.get(i));
                firstPlayer.remove(i);
                secondPlayer.remove(i);
                i--;
                if(firstPlayer.isEmpty()){
                    break;
                }
            } else {
                firstPlayer.remove(i);
                secondPlayer.remove(i);
                i--;
            }

        }
        int sum1 = 0;

        for (int i = 0; i < firstPlayer.size(); i++) {
            sum1 += firstPlayer.get(i);
        }
        int sum2 = 0;
        for (int i = 0; i < secondPlayer.size(); i++) {
            sum2 += secondPlayer.get(i);
        }
        if (sum1 > sum2) {
            System.out.printf("First player wins! Sum: %d", sum1);
        }
        if (sum2 > sum1) {
            System.out.printf("Second player wins! Sum: %d", sum2);
        }
    }
}
