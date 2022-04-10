package FinalExam;

import groovyjarjarantlr4.v4.runtime.tree.xpath.XPathWildcardAnywhereElement;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FE01PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String line = scanner.nextLine();
        while (!line.equals("Complete")) {
            String[] data = line.split("\\s+");
            String command = data[0];
            switch (command) {
                case "Make":
                    String casing = data[1];
                    int index = Integer.parseInt(data[2]);
                    if (isValid(index, password)) {
                        if (casing.equals("Upper")) {
                            password = password.replace(password.charAt(index), password.toUpperCase(Locale.ROOT).charAt(index));
                            System.out.println(password);
                        } else if (casing.equals("Lower")) {
                            password = password.replace(password.charAt(index), password.toLowerCase(Locale.ROOT).charAt(index));
                            System.out.println(password);
                        }
                    }
                    break;
                case "Insert":
                    int i = Integer.parseInt(data[1]);
                    String letter = data[2];
                    if (isValid(i, password)) {
                        String subPass1 = password.substring(0, i);
                        String subPass2 = password.substring(i);
                        password = subPass1 + letter + subPass2;
                        System.out.println(password);
                    }
                    break;
                case "Replace":
                    String toBeReplaced = data[1];
                    char oldChar = toBeReplaced.charAt(0);
                    int value = Integer.parseInt(data[2]);
                    char newChar = (char) (value + oldChar);

                    if (password.contains(toBeReplaced)) {
                        password = password.replace(oldChar, newChar);
                        System.out.println(password);
                    }
                    break;
                case "Validation":
                    passwordValidator(password);
                    break;
            }
            line = scanner.nextLine();
        }
    }

    private static boolean isValid(int index, String password) {
        if (index >= 0 && index < password.length()) {
            return true;
        } else {
            return false;
        }
    }

    private static void passwordValidator(String password) {
        Pattern length = Pattern.compile(".{8,}");
        Pattern symbols = Pattern.compile("[^\\w]+");
        Pattern upper = Pattern.compile("[A-Z]+");
        Pattern lower = Pattern.compile("[a-z]+");
        Pattern digits = Pattern.compile("\\d+");
        Matcher lengthMatch = length.matcher(password);
        Matcher upperMatch = upper.matcher(password);
        Matcher lowerMatch = lower.matcher(password);
        Matcher symbolsMatch = symbols.matcher(password);
        Matcher digitMatch = digits.matcher(password);

        if (!lengthMatch.find()) {
            System.out.println("Password must be at least 8 characters long!");

        }
        if (symbolsMatch.find()) {
            System.out.println("Password must consist only of letters, digits and _!");

        }
        if (!upperMatch.find()) {
            System.out.println("Password must consist at least one uppercase letter!");

        }
        if (!lowerMatch.find()) {
            System.out.println("Password must consist at least one lowercase letter!");

        }
        if (!digitMatch.find()) {
            System.out.println("Password must consist at least one digit!");

        }

    }
}
