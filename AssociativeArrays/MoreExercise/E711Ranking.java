package Excercise7_AssociativeArrays_More_Exercise;

import java.util.*;

public class E711Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> courses = new HashMap<>();
        Map<String, Map<String, Integer>> students = new TreeMap<>();
        Map<String, Integer> results = new LinkedHashMap<>();
        String line = scanner.nextLine();

        int tempPoints = 0;
        while (!line.equals("end of contests")) {
            String[] data = line.split(":");
            courses.putIfAbsent(data[1], data[0]);

            line = scanner.nextLine();
        }
        line = scanner.nextLine();

        while (!line.equals("end of submissions")) {

            String[] data = line.split("=>");
            String contest = data[0];
            String password = data[1];
            String name = data[2];
            int points = Integer.parseInt(data[3]);

            for (var input : courses.entrySet()) {

                if (password.equals(input.getKey()) && contest.equals(input.getValue())) {

                    students.putIfAbsent(name, new LinkedHashMap<>());
                    results.putIfAbsent(name, 0);

                    if (!students.get(name).containsKey(contest)) {

                        students.get(name).put(contest, points);
                        tempPoints = students.get(name).get(contest);
                        results.put(name, results.get(name) + points);

                    } else if (students.get(name).get(contest) < points) {
                        tempPoints = students.get(name).get(contest);
                        students.get(name).put(contest, points);
                        results.put(name, results.get(name) + points - tempPoints);
                    }
                }
            }

            line = scanner.nextLine();
        }
        String winner = "";
        int maxPoints = 0;

        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            if (entry.getValue() > maxPoints) {
                maxPoints = entry.getValue();
                winner = entry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", winner, maxPoints);
        System.out.println("Ranking: ");
        students.forEach((k, v) -> {
            System.out.printf("%s%n", k);

            v.entrySet().stream().sorted((p1, p2) -> Integer.compare(p2.getValue(), p1.getValue()))
                    .forEach(score -> System.out.printf("#  %s -> %d%n", score.getKey(), score.getValue()));

        });
    }
}