package Excercise9_Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E906ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String emailRegex = "\\b[A-Za-z\\d]+[\\.\\-_]*[A-Za-z\\d]*[\\.\\-_]*[A-Za-z\\d]*[^\\.\\-_]@[A-Za-z\\.\\-]+\\.[A-Za-z]{2,}";
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(line);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
