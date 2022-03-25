package Lab10_FinalExamPreparation;

import java.util.Scanner;

public class L1001TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Decode")) {
            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];
            switch (commandName) {

                case "Move":
                    message = move(message, Integer.parseInt(commandParts[1]));
                    break;

                case "Insert":
                    message = insert(message, Integer.parseInt(commandParts[1]), commandParts[2]);
                    break;

                case "ChangeAll":
                    message = changeAll(message, commandParts[1], commandParts[2]);
                    break;

            }

            command = scanner.nextLine();

        }
        System.out.printf("The decrypted message is: %s", message);
    }

    private static String changeAll(String message, String substring, String replacement) {


        return message.replace(substring, replacement);
    }

    private static String insert(String message, int index, String substring) {
        String firstPart = message.substring(0, index);
        String secondPart = message.substring(index);
        return firstPart + substring + secondPart;
    }

    private static String move(String message, int length) {
        String firstPart = message.substring(0, length);
        String secondPart = message.substring(length);

        return secondPart + firstPart;
    }
}
