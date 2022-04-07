package Excercise7_AssotiativeArrays;

import java.util.*;

public class E703LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String winner = "";
        boolean hasWinner = false;

        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);
        //ето това е HashMap, който да замести switch

        Map<String, String> legendaryItems = new HashMap<>();
        legendaryItems.put("shards", "Shadowmourne obtained!");
        legendaryItems.put("fragments", "Valanyr obtained!");
        legendaryItems.put("motes", "Dragonwrath obtained!");



        while (!hasWinner) {
            String[] data = scanner.nextLine().split("\\s+");
            for (int i = 0; i < data.length - 1; i += 2) {

                int quantity = Integer.parseInt(data[i]);
                String resource = data[i + 1].toLowerCase();

                items.putIfAbsent(resource, 0);
                items.put(resource, items.get(resource) + quantity);

                if (resource.equals("shards") ||
                        resource.equals("fragments") ||
                        resource.equals("motes")) {

                    if (items.get(resource) >= 250) {
                        items.put(resource, items.get(resource) - 250);
                        winner = resource;
                        hasWinner = true;
                        break;
                    }
                }
            }
        }

        //това е класическото решение със суич, но има и друго, по-добро

       /* switch (winner) {

            case "shards":
                System.out.println("Shadowmourne obtained!");
                break;
            case "fragments":
                System.out.println("Valanyr obtained!");
                break;
            case "motes":
                System.out.println("Dragonwrath obtained!");
                break;

        }*/
        System.out.println(legendaryItems.get(winner));


        items.forEach((k, v) -> System.out.printf("%s: %d%n", k, v));
    }
}
