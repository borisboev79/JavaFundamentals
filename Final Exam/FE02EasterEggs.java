package FinalExam;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FE02EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[@#]+(?<color>[a-z]{3,})[@#]+[^A-Za-z0-9]*/+(?<num>\\d+)/+");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.printf("You found %d %s eggs!%n", Integer.parseInt(matcher.group("num")), matcher.group("color"));
        }
    }
}
