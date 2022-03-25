package Lab10_FinalExamPreparation;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L1002DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([=/])(?<destination>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);
        int points = 0;

        List<String> destinations = new LinkedList<>();

        while(matcher.find()){
           destinations.add(matcher.group("destination"));
           points += matcher.group("destination").length();
        }

        System.out.println("Destinations: " + String.join(", ", destinations));
      //  System.out.println("Travel Points: " + points);

        //ИЛИ

        System.out.println("Travel Points: " + destinations
                .stream()
                .mapToInt(d -> d.length())
                .sum()
        );
    }
}
