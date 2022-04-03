package FinalExam;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EasterEggs2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("([@#]+)(?<color>[a-z]{3,})((?<all>[@#]+)(\\W+)([/]+))(?<digit>(\\d+))([/]+)");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        List<Eggs> eggs = new LinkedList<>();

        while (matcher.find()) {
            String paint = matcher.group("paint");
            int Egg = Integer.parseInt(matcher.group("Egg"));

            Eggs eggs1 = new Eggs(paint, Egg);
            eggs.add(eggs1);
        }

        eggs.forEach(System.out::println);

    }

    static class Eggs {
        String paint;
        int Egg;

        public Eggs(String color, int digit) {
            this.paint = color;
            this.Egg = digit;
        }

        @Override
        public String toString() {
            return String.format("You found %d %s eggs!", this.Egg, this.paint);
        }
    }
}