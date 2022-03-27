package Lab10_FinalExamPreparation;

import java.util.Locale;
import java.util.Scanner;

public class L1006ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String raw = scanner.nextLine();
        String commands = scanner.nextLine();
        while (!commands.equals("Generate")) {
            String[] data = commands.split(">>>");
            String command = data[0];
            switch (command) {
                case "Contains":
                    String substring = data[1];
                    if (raw.contains(substring)) {
                        System.out.printf("%s contains %s%n", raw, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String letterSize = data[1];
                    int startIndex = Integer.parseInt(data[2]);
                    int endIndex = Integer.parseInt(data[3]);
                    String toChange = raw.substring(startIndex, endIndex);
                    String changed = "";
                    if (letterSize.equals("Upper")) {
                        changed = toChange.toUpperCase(Locale.ROOT);
                    }else{
                        changed = toChange.toLowerCase(Locale.ROOT);
                    }
                    raw = raw.replace(toChange, changed);
                    System.out.println(raw);

                    break;
                case "Slice":
                    int startCut = Integer.parseInt(data[1]);
                    int endCut = Integer.parseInt(data[2]);
                    StringBuilder sb = new StringBuilder(raw);
                    sb.delete(startCut, endCut);
                    raw = sb.toString();
                    System.out.println(raw);
                    break;
            }
            commands = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + raw);
    }
}
