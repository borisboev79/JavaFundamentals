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
        Pattern pattern = Pattern.compile("([@#])(?<text>[A-Za-z]{3,}\\1\\1[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(input);
        List<String> wordMatches = new LinkedList<>();
        List<String> results = new LinkedList<>();
        StringBuilder mirror = new StringBuilder();
        while (matcher.find()) {
            wordMatches.add(matcher.group("text"));
        }
        if (!wordMatches.isEmpty()) {
            System.out.printf("%d word pairs found!%n", wordMatches.size());
        } else {
            System.out.println("No word pairs found!");
        }

        for (String wordMatch : wordMatches) {
            mirror.setLength(0);

            String word = wordMatch.replaceAll("[@#]", "");
            if (word.length() % 2 == 0) {

                for (int j = 0; j < word.length() / 2; j++) {

                    if (word.charAt(j) == word.charAt(word.length() - 1 - j)) {
                        mirror.append(word.charAt(j));
                    } else {
                        mirror.setLength(0);
                        break;
                    }
                }
                String mirrorStraight = mirror.toString();
                mirror.reverse();

                if (mirror.length() > 0) {
                    results.add(mirrorStraight + " <=> " + mirror);
                }
            }
        }
        if (mirror.length() > 0) {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", results));
        } else {
            System.out.println("No mirror words!");
        }
    }
}
