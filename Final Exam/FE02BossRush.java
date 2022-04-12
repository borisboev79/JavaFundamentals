package FinalExam;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FE02BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String boss = scanner.nextLine();

            Pattern pattern = Pattern.compile("^\\|(?<boss>[A-Z]{4,})\\|:#(?<title>[A-Za-z]+ [A-Za-z]+)#$");
            Matcher matcher = pattern.matcher(boss);
             if(matcher.find()){
                 System.out.println(matcher.group("boss")  + ", The " + matcher.group("title"));
                 System.out.println(">> Strength: " + matcher.group("boss").length());
                 System.out.println(">> Armor: " + matcher.group("title").length());
            } else {
                 System.out.println("Access denied!");
             }
        }
    }
}
