package Excercise9_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class E905NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daemons = (scanner.nextLine().split("\\s*,+\\s*"));


        for (String daemon : daemons) {

            Pattern healthPattern = Pattern.compile("[^0-9+\\-*/.]");
            Matcher healthMatcher = healthPattern.matcher(daemon);
            int health = 0;


          StringBuilder sb = new StringBuilder();

            while (healthMatcher.find()) {

                sb.append(healthMatcher.group());
            }
            for (int i = 0; i < sb.length(); i++) {
                int newChar = sb.charAt(i);
                health += newChar;

            }

            Pattern damagePattern = Pattern.compile("([\\-+]?\\d+\\.\\d+|[\\-+]?\\d+)");
            Matcher damageMatcher = damagePattern.matcher(daemon);

            double damage = 0;

            while (damageMatcher.find()) {
                damage += Double.parseDouble(damageMatcher.group());

            }

            for (int j = 0; j < daemon.length(); j++) {

                if (daemon.charAt(j) == '*') {
                    damage *= 2.0;
                } else if (daemon.charAt(j) == '/') {
                    damage /= 2.0;
                }
            }


            System.out.printf("%s - %d health, %.2f damage%n", daemon, health, damage);

        }

    }
}
