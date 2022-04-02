package Excercise4_Methods;

import java.util.Scanner;

public class E404PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (passLengthValid(password) && passOnlyDigitsAndLetters(password) && passMin2Digits(password)) {
            System.out.println("Password is valid");
        }
        if (!passLengthValid(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!passOnlyDigitsAndLetters(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!passMin2Digits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    private static boolean passLengthValid(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        return false;
    }

    private static boolean passOnlyDigitsAndLetters(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.toLowerCase().charAt(i);
            if ((symbol < 48 || symbol > 57) && (symbol < 97 || symbol > 122)) {
                return false;

            }

        }
        return true;
    }

    private static boolean passMin2Digits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if ((symbol >= 48 && symbol <= 57)) {
                count++;
            }

            if (count == 2) {
                return true;
            }


        }
        return false;
    }
}
