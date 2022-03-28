package Lab10_FinalExamPreparation;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E1013EmojiDetector_int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("([:]{2}|[*]{2})(?<smiley>[A-Z][a-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);
        int coolThreshold = 1;
        int coolMeter = 0;
        List<String> smileys = new LinkedList<>();
        int counter = 0;

        Pattern digits = Pattern.compile("\\d");
        Matcher digitMatcher = digits.matcher(input);

        while (digitMatcher.find()) {


            coolThreshold *= Integer.parseInt(digitMatcher.group());
        }
        while (matcher.find()) {
            counter++;
            String word = matcher.group();
            for (int i = 0; i < word.length(); i++) {
                if (Character.isLetter(word.charAt(i))) {

                    coolMeter += word.charAt(i);
                }
            }
            if (coolMeter >= coolThreshold) {
                smileys.add(matcher.group());

            }
            coolMeter = 0;
        }
        System.out.println("Cool threshold: " + coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", counter);
        smileys.forEach(System.out::println);

    }
}

