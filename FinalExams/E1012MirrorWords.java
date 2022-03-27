package Lab10_FinalExamPreparation;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E1012MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("([@#])(?<word1>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(input);
        List<String> wordMatches1 = new LinkedList<>();
        List<String> wordMatches2 = new LinkedList<>();
        List<String> results = new LinkedList<>();

        while (matcher.find()) {
            wordMatches1.add(matcher.group("word1"));
            wordMatches2.add(matcher.group("word2"));
        }
        if (!wordMatches1.isEmpty()) {
            System.out.printf("%d word pairs found!%n", wordMatches1.size());
        } else {
            System.out.println("No word pairs found!");
        }

        for (int i = 0; i < wordMatches1.size(); i++) {
            String word1 = wordMatches1.get(i);
            StringBuilder temp = new StringBuilder(wordMatches2.get(i));
            String word2 = temp.reverse().toString();
            if (word1.equals(word2)) {
                results.add(word1 + " <=> " + temp.reverse());
            }

        }
        if (results.size() > 0) {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", results));
        } else {
            System.out.println("No mirror words!");
        }
    }
}
