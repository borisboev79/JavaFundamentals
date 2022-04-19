package FinalExam;

import java.util.*;

public class FE03DegustationParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, List<String>> people = new LinkedHashMap<>();
        int dislikedMeals = 0;
        while (!line.equals("Stop")) {
            String[] data = line.split("-");
            String command = data[0];
            String name = data[1];
            String meal = data[2];
            switch (command) {
                case "Like":
                    people.putIfAbsent(name, new ArrayList<>());
                    if (people.get(name).contains(meal)) {
                        break;
                    } else {
                        people.get(name).add(meal);
                    }
                    break;
                case "Dislike":
                    if (people.containsKey(name)) {
                        if (people.get(name).contains(meal)) {
                            people.get(name).remove(meal);
                            System.out.println(name + " doesn't like the " + meal);
                            dislikedMeals++;
                        } else {
                            System.out.println(name + " doesn't have the " + meal + " in his/her collection.");
                        }
                    } else {
                        System.out.println(name + " is not at the party.");
                    }

                    if (people.containsKey(name))

                        break;
            }
            line = scanner.nextLine();
        }
        for(Map.Entry<String, List<String>> entry : people.entrySet()){
            System.out.println(entry.getKey()+ ": " + entry.getValue().toString().replaceAll("[\\[\\]]", ""));

        }
        System.out.println("Unliked meals: " + dislikedMeals);
    }
}
