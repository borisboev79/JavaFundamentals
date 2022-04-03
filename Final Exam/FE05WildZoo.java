package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FE05WildZoo {
    public static void main(String[] args) {
        //NOT SOLVED YET!!
        Scanner scanner = new Scanner(System.in);
        Map<String, Animal> animals = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("EndDay")) {
            String[] data = input.split("-");
            String command = data[0];
            switch (command) {
                case "Add:":
                    handleAdd(animals, data[1], Integer.parseInt(data[2]), data[3]);
                    break;
                case "Feed:":
                    handleFeed(animals, data[1], Integer.parseInt(data[2]));
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println("Animals:");
        animals.forEach(System.out::printf);

    }

    private static void handleFeed(Map<String, Animal> animals, String name, int food) {

        animals.get(name).setFood(animals.get(name).getFood() - food);
        if(animals.get(name).getFood() <= 0){
            System.out.printf("%s was successfully fed", name);
            animals.remove(name);
        }
    }

    private static void handleAdd(Map<String, Animal> animals, String name, int food, String area) {
        animals.putIfAbsent(name, new Animal(name, 0, area));
        animals.get(name).setName(name);
        animals.get(name).setFood(animals.get(name).getFood() + food);
        animals.get(name).setArea(area);

    }

    static class Animal {
        String name;
        int food;
        String area;

        public Animal(String name, int food, String area) {
            this.name = name;
            this.food = food;
            this.area = area;
        }

        @Override
        public String toString() {
            return String.format("%s -> %dg", this.name, this.food);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getFood() {
            return food;
        }

        public void setFood(int food) {
            this.food = food;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }
    }
}
