package FinalExam;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class FE01DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String line = scanner.nextLine();

        while (!line.equals("Finish")) {
            String[] data = line.split(" ");
            String command = data[0];
            switch (command) {
                case "Replace" -> {
                    String current = data[1];
                    String newChars = data[2];
                    input = input.replace(current, newChars);
                    System.out.println(input);
                }
                case "Cut" -> {
                    int start = Integer.parseInt(data[1]);
                    int end = Integer.parseInt(data[2]) + 1;
                    if ((start >= 0 && start < end) && end < input.length()) {
                        String substring = input.substring(start, end);
                        input = input.replace(substring, "");
                        System.out.println(input);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                }
                case "Make" -> {
                    if (data[1].equals("Upper")) {
                        input = input.toUpperCase(Locale.ROOT);
                    } else {
                        input = input.toLowerCase(Locale.ROOT);
                    }
                    System.out.println(input);
                }
                case "Check" -> {
                    String check = data[1];
                    if (input.contains(check)) {
                        System.out.println("Message contains " + check);
                    } else {
                        System.out.println("Message doesn't contain " + check);
                    }
                }
                case "Sum" -> {
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]) + 1;
                    if ((startIndex >= 0 && startIndex < endIndex) && endIndex < input.length()) {
                        String substr = input.substring(startIndex, endIndex);
                        int sum = 0;
                        for (int i = 0; i < substr.length(); i++) {
                            sum += (char) substr.charAt(i);
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                }
            }
            line = scanner.nextLine();
        }

    }
}
