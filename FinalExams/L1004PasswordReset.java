package Lab10_FinalExamPreparation;

import java.util.Locale;
import java.util.Scanner;

public class L1004PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder password = new StringBuilder();
        String command = scanner.nextLine();
        while (!command.equals("Done")) {

            if (command.contains("TakeOdd")) {
                System.out.println(handleTakeOdd(input, password));
            } else if (command.contains("Cut")) {
                System.out.println(handleCut(command, password));
            } else if (command.contains("Substitute")) {
                handleSubstitute(command, password);
            }
            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);
    }

    private static StringBuilder handleTakeOdd(String input, StringBuilder password) {
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 != 0) {
                password.append(input.charAt(i));
            }
        }
        return password;
    }

    private static StringBuilder handleCut(String command, StringBuilder password) {
        String[] data = command.split("\\s+");
        int index = Integer.parseInt(data[1]);
        int length = Integer.parseInt(data[2]);
        String tempPass = password.toString();
  
        String substringToCut = tempPass.substring(index, index +  length);
        String tempPass2 = tempPass.replaceFirst(substringToCut, "");
        password.setLength(0);
        password.append(tempPass2);

        return password;
    }

    private static void handleSubstitute(String command, StringBuilder password) {
        String[] data = command.split("\\s+");
        String substring = data[1];
        String replacement = data[2];

        String tempPassword = password.toString();
        if(tempPassword.contains(substring)) {
            password.setLength(0);
            password.append(tempPassword.replace(substring, replacement));
            System.out.println(password);
        } else{
            System.out.println("Nothing to replace!");
        }

    }

}
