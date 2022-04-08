package FinalExam;

import java.util.Locale;
import java.util.Scanner;

public class FE01Hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String spell = scanner.nextLine();
        String line = scanner.nextLine();
        while (!line.equals("Abracadabra")) {
            String[] data = line.split("\\s+");
            String command = data[0];
            switch (command) {
                case "Abjuration":
                    spell = spell.toUpperCase(Locale.ROOT);
                    System.out.println(spell);
                    break;
                case "Necromancy":
                    spell = spell.toLowerCase(Locale.ROOT);
                    System.out.println(spell);
                    break;
                case "Illusion":
                    int index = Integer.parseInt(data[1]);
                    String letter = data[2];
                    if (index > -1 && index < spell.length()) {
                        String old = Character.toString(spell.charAt(index));
                        spell = spell.replace(old, letter);
                        System.out.println("Done!");
                    } else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "Divination":
                    String first = data[1];
                    String second = data[2];
                    if (spell.contains(first)) {
                        spell = spell.replace(first, second);
                        System.out.println(spell);
                    }
                    break;
                case "Alternation":
                    String substring = data[1];
                    spell = spell.replace(substring, "");
                    System.out.println(spell);
                    break;
                default:
                    System.out.println("The spell did not work!");
                    break;
            }
            line = scanner.nextLine();
        }
    }
}


