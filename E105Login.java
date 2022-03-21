package Exercise1;

import java.util.Scanner;

public class E105Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }
        String passwordInput = scanner.nextLine();
        for (int j = 1; j <= 4; j++) {
            if (passwordInput.equals(password)) {
                System.out.printf("User %s logged in.", username);
                break;
            } else {
                if (j == 4) {
                    System.out.printf("User %s blocked!", username);
                    break;
                } else {
                    System.out.println("Incorrect password. Try again.");

                }
                passwordInput = scanner.nextLine();
            }

        }

    }
}


