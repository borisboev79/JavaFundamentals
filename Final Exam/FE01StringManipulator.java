package FinalExam;

import java.util.Locale;
import java.util.Scanner;

public class FE01StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String commands = scanner.nextLine();
        while (!line.equals("End")) {
            String[] data = commands.split("\\s+");
            String command = data[0];
            switch (command) {
                case "Translate":
                    char from = data[1].charAt(0);
                    char to = data[2].charAt(0);
                    line = line.replace(from, to);
                    System.out.println(line);
                    break;
                case "Includes":
                    String sub = data[1];
                    if (line.contains(sub)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String start = data[1];
                    if(line.startsWith(start)){
                        System.out.println("True");
                    } else{
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    line = line.toLowerCase(Locale.ROOT);
                    System.out.println(line);
                    break;
                case "FindIndex":
                   int index = line.lastIndexOf(data[1]);
                    System.out.println(index);
                    break;
                case "Remove":
                    int cutFrom = Integer.parseInt(data[1]);
                    int cutTo = Integer.parseInt(data[2]) + cutFrom;
                    String substring = line.substring(cutFrom, cutTo);
                    line = line.replace(substring, "");
                    System.out.println(line);
                    break;
            }
            commands = scanner.nextLine();
        }
    }
}
