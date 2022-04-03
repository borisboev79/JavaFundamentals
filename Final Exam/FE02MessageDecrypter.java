package FinalExam;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FE02MessageDecrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String message = scanner.nextLine();

            Pattern pattern = Pattern.compile("^([%$])(?<tag>[A-Z][a-z]{2,})\\1:\\s(?<chars>(\\[\\d+\\]\\|){3})$");
            Matcher matcher = pattern.matcher(message);

                if (matcher.find()) {
                    String tag = matcher.group("tag");
                    String code = matcher.group("chars");
                    Pattern digits = Pattern.compile("\\[(?<num>\\d+)\\]\\|");
                    Matcher extractNums = digits.matcher(code);

                    while (extractNums.find()) {
                        char c = (char) Integer.parseInt(extractNums.group("num"));
                        sb.append(c);
                    }
                    System.out.printf("%s: %s%n", tag, sb.toString());
                    sb.setLength(0);
                }else{
                System.out.println("Valid message not found!");
            }
            }

        }

    }

