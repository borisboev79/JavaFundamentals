package Excercise7_AssotiativeArrays;

import java.util.*;

public class E706Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courses = new LinkedHashMap<>();
        String line = scanner.nextLine();


        while (!line.equals("end")) {
            String[] data = line.split("\\s+\\:\\s+");

                courses.putIfAbsent(data[0], new ArrayList<>());
                courses.get(data[0]).add(data[1]);

            line = scanner.nextLine();
        }

        courses.forEach((k, v) -> {

            System.out.printf("%s: %d%n", k, v.size());
            for (String name : v) {
                System.out.println("-- " + name);
            }
        });

    }


}

