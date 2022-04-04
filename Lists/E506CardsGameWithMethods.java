package Excercise5_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E506CardsGameWithMethods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        winningPlayer(scanner);

    }

    private static void winningPlayer(Scanner scanner) {

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        List<Integer> firstPlayer = arrayList(first);
        List<Integer> secondPlayer = arrayList(second);

        do {
            if (firstPlayer.get(0) > secondPlayer.get(0)) {

                firstPlayer.add(secondPlayer.get(0));
                firstPlayer.add(firstPlayer.get(0));

            } else if (firstPlayer.get(0) < secondPlayer.get(0)) {

                secondPlayer.add(firstPlayer.get(0));
                secondPlayer.add(secondPlayer.get(0));
            }

            firstPlayer.remove(0);
            secondPlayer.remove(0);

        } while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty());

        printWinner(firstPlayer, secondPlayer);
    }

    private static List<Integer> arrayList(String input) {

        List<Integer> player = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        return player;
    }

    private static void printWinner(List<Integer> firstPlayer, List<Integer> secondPlayer) {

        int sum1 = sumPoints(firstPlayer);
        int sum2 = sumPoints(secondPlayer);

        if (sum1 > sum2) {
            System.out.printf("First player wins! Sum: %d", sum1);
        }
        if (sum2 > sum1) {
            System.out.printf("Second player wins! Sum: %d", sum2);
        }
    }

    private static int sumPoints(List<Integer> player) {

        int sum = 0;

        for (int i = 0; i < player.size(); i++) {

            sum += player.get(i);

        }
        return sum;
    }
}

