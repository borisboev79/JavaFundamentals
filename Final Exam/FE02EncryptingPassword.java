package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FE02EncryptingPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            Pattern pattern = Pattern.compile("(.+)>(?<num>[\\d]{3})\\|(?<small>[a-z]{3})\\|(?<caps>[A-Z]{3})\\|(?<chars>[^<>]{3})<\\1");
            Matcher matcher = pattern.matcher(line);

            if (matcher.matches()) {
                System.out.println("Password:");
                System.out.print(matcher.group("num"));
                System.out.print(matcher.group("small"));
                System.out.print(matcher.group("caps"));
                System.out.println(matcher.group("chars"));
            } else {
                System.out.println("Try another password!");
            }
        }
    }
}

