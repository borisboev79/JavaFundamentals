package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FE02MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            Pattern pattern = Pattern.compile("!(?<command>[A-Z][a-z]{2,})!:\\[(?<string>[A-Za-z]{8,})\\]");
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                System.out.print(matcher.group("command") + ": ");
                String string = matcher.group("string");
                for (int j = 0; j < string.length(); j++) {
                    int num = string.charAt(j);
                    if (j < string.length() - 1) {
                        System.out.print(num + " ");
                    } else {
                        System.out.println(num);
                    }
                }
            } else {
                System.out.println("The message is invalid");
            }
        }
    }
}
