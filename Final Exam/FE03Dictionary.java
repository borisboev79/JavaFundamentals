package FinalExam;

import java.util.*;

public class FE03Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> dictionary = new LinkedHashMap<>();
        String[] words = input.split("\\|\\s+");

        for (String s : words) {
            String[] data = s.split(":\\s+");
            String word = data[0];
            String meaning = data[1];
            dictionary.putIfAbsent(word, new ArrayList<>());
            dictionary.get(word).add(meaning);
        }

        String test = scanner.nextLine();
        String[] testWords = test.split("\\s+\\|\\s+");
        String command = scanner.nextLine();

        if (command.equals("Test")) {
            for (String testWord : testWords) {

                if (dictionary.containsKey(testWord)) {
                    System.out.println(testWord + ":");

                    for (String definition : dictionary.get(testWord)) {
                        System.out.println("-" + definition);
                    }
                }
            }
        } else if (command.equals("Hand Over")) {
                for(Map.Entry<String, List<String>> entry : dictionary.entrySet()){
                    System.out.print(entry.getKey() + " ");
                }

        }
    }
}
