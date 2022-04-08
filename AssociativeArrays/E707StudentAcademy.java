package Excercise7_AssotiativeArrays;

import java.util.*;

public class E707StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsInfo = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            studentsInfo.putIfAbsent(name, new ArrayList<>());
            studentsInfo.get(name).add(grade);

        }
        studentsInfo.entrySet().stream()
                .filter(s -> s.getValue()
                        .stream()
                        .mapToDouble(x -> x)
                        .average()
                        .orElse(0.0) >= 4.50)
                .forEach(entry -> {
                    double averageGrade = entry.getValue()
                            .stream().mapToDouble(x -> x)
                            .average()
                            .orElse(0.0);
                    System.out.printf("%s -> %.2f%n", entry.getKey(), averageGrade);
                });
    }
}
