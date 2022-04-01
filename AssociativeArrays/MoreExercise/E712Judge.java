package Excercise7_AssociativeArrays_More_Exercise;

import java.util.*;

public class E712Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, TreeMap<String, Integer>> score = new LinkedHashMap<>();

        Map<String, Integer> totalResults = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("no more time")) {
            String[] data = input.split(" -> ");
            String course = data[1];
            String name = data[0];
            int points = Integer.parseInt(data[2]);

            Map<String, Integer> check = score.get(course);

            if (check == null) {
                score.put(course, new TreeMap<>());
                score.get(course).put(name, points);

                totalResults.putIfAbsent(name, 0);
                totalResults.put(name, totalResults.get(name) + points);

            } else if (check.containsKey(name) && (score.get(course).get(name) < points)) {
                int tempPoints = score.get(course).get(name);

                totalResults.put(name, totalResults.get(name) + points - tempPoints);
                score.get(course).put(name, points);
            } else if (!check.containsKey(name)) {
                score.get(course).put(name, points);

                totalResults.putIfAbsent(name, 0);
                totalResults.put(name, totalResults.get(name) + points);

            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, TreeMap<String, Integer>> entry : score.entrySet()) {
            System.out.printf("%s: %d participants%n", entry.getKey(), entry.getValue().size());

            final int[] order = {0};

            entry.getValue().entrySet()
                    .stream()
                    .sorted((p1, p2) -> p2.getValue().compareTo(p1.getValue()))
                    .forEach(result -> {
                        order[0]++;
                        System.out.printf("%d. %s <::> %d%n", order[0], result.getKey(), result.getValue());
                    });

        }


        System.out.println("Individual standings:");
        final int[] counter = {0};
        totalResults.entrySet()
                .stream()
                .sorted((p1, p2) -> Integer.compare(p2.getValue(), p1.getValue()))
                .forEach(result -> {
                    counter[0]++;
                    System.out.printf("%d. %s -> %d%n", counter[0], result.getKey(), result.getValue());
                });


    }

}

