package Excercise8_TextProcessing;

import java.util.Arrays;
import java.util.Scanner;

public class E801ValidUsernamesBB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = Arrays.stream(scanner.nextLine().split(", ")).toArray(String[]::new);

        boolean isValid = false;

        for (String username : usernames) {
            isValid = false;
            if (username.length() >= 3 && username.length() <= 16) for (int j = 0; j < username.length(); j++) {
                if (Character.isLetterOrDigit(username.charAt(j)) || username.charAt(j) == '_' || username.charAt(j) == '-') {
                    isValid = true;
                } else {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.println(username);
            }
        }
    }
}





