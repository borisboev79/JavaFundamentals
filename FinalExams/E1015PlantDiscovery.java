package Lab10_FinalExamPreparation;

import java.util.*;

public class E1015PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Plant> plant = new LinkedHashMap<>();
        Map<String, List<Double>> ratings = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] data = scanner.nextLine().split("<->");
            String name = data[0];
            int plantRarity = Integer.parseInt(data[1]);
            if(plant.containsKey(name)){
                plant.get(name).setRarity(plantRarity);
            }else {
                plant.put(name, new Plant(name, plantRarity, 0.0));
            }
            ratings.putIfAbsent(name, new LinkedList<>());

        }
        String line = scanner.nextLine();
        while (!line.equals("Exhibition")) {
            String[] commands = line.split(":\\s+|\\s+-\\s+");
            String command = commands[0];
            switch (command) {
                case "Rate":
                    handleRate(plant, ratings, commands[1], Double.parseDouble(commands[2]));
                    break;
                case "Update":
                    handleUpdate(plant, commands[1], Integer.parseInt(commands[2]));
                    break;
                case "Reset":
                    handleReset(plant, ratings, commands[1]);
                    break;
            }
            line = scanner.nextLine();
        }




        System.out.println("Plants for the exhibition:");
        plant.values().forEach(System.out::println);
    }

    private static void handleRate(Map<String, Plant> plant, Map<String, List<Double>> ratings, String name, double rating) {
        if (ratings.containsKey(name)) {
            ratings.get(name).add(rating);
            double average = ratings.get(name).stream().mapToDouble(d -> d).average().getAsDouble();
            plant.get(name).setRating(average);
        }else{
            System.out.println("error");
        }
    }

    private static void handleUpdate(Map<String, Plant> plant, String name, int rarity) {
        if(plant.containsKey(name)) {
            plant.get(name).setRarity(rarity);
        }else{
            System.out.println("error");
        }

    }

    private static void handleReset(Map<String, Plant> plant, Map<String, List<Double>> ratings, String name) {
        if(plant.containsKey(name)) {
            plant.get(name).setRating(0);

            ratings.get(name).removeAll(ratings.get(name));

        }else{
            System.out.println("error");
        }
    }


    static class Plant {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRarity() {
            return rarity;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        String name;
        int rarity;
        double rating;

        @Override
        public String toString() {
            return String.format("- %s; Rarity: %d; Rating: %.2f", this.name, this.rarity, this.rating);
        }

        public Plant(String name, int rarity, double rating) {
            this.name = name;
            this.rarity = rarity;
            this.rating = rating;


        }
    }
}
