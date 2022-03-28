package Lab10_FinalExamPreparation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E1013EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("([:*]{2})(?<smiley>[A-Z][a-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);
        long coolThreshold = 1;
        List<String> smileys = new LinkedList<>();
        List<String> coolness = new ArrayList<>();
        List<String> results = new LinkedList<>();
        while (matcher.find()) {
            smileys.add(matcher.group());
            coolness.add(matcher.group("smiley"));
        }
        Pattern digits = Pattern.compile("\\d");
        Matcher digitMatcher = digits.matcher(input);

        while (digitMatcher.find()) {
            coolThreshold *= Integer.parseInt(digitMatcher.group());
        }
        for (int i = 0; i < coolness.size(); i++) {
            int coolMeter = 0;
            for (int j = 0; j < coolness.get(i).length(); j++) {
                coolMeter += coolness.get(i).charAt(j);
            }
            if (coolMeter >= coolThreshold) {
                results.add(coolness.get(i));
            }
        }
        System.out.println("Cool threshold: " + coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", smileys.size());

        for (int i = 0; i < results.size(); i++) {
            if (smileys.get(i).contains(results.get(i))) {
                System.out.println(smileys.get(i));
            }
        }
    }
}
