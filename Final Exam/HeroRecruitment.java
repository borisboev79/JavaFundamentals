package FinalExam;

import java.util.*;

public class HeroRecruitment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> heroes = new LinkedHashMap<>();
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] data = line.split("\\s+");
            String command = data[0];
            if (command.equals("Enroll")) {
                String name = data[1];
                if (!heroes.containsKey(name)) {
                    heroes.put(name, new ArrayList<>());
                } else {
                    System.out.printf("%s is already enrolled.%n", name);
                }
            }
            if (command.equals("Learn")) {
                String name = data[1];
                String spell = data[2];
                if (heroes.containsKey(name)) {
                    if (!heroes.get(name).contains(spell)) {
                        heroes.get(name).add(spell);
                    } else {
                        System.out.printf("%s has already learnt %s.%n", name, spell);
                    }
                } else {
                    System.out.printf("%s doesn't exist.%n", name);
                }
            }
            if (command.equals("Unlearn")) {
                String name = data[1];
                String spell = data[2];
                if (heroes.containsKey(name)) {
                    if (heroes.get(name).contains(spell)) {
                        heroes.get(name).remove(spell);
                    } else {
                        System.out.printf("%s doesn't know %s.%n", name, spell);
                    }
                } else {
                    System.out.printf("%s doesn't exist.%n", name);
                }
            }
            line = scanner.nextLine();
        }
        System.out.println("Heroes:");

        heroes.entrySet().forEach(e -> {
            System.out.printf("== %s: ", e.getKey());
            System.out.printf("%s%n", String.join(", ",e.getValue()));
        });
    }
}