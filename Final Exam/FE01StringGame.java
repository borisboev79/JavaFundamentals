package FinalExam;

import java.util.Locale;
import java.util.Scanner;

public class FE01StringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String line = scanner.nextLine();
        while (!line.equals("Done")) {
            String[] data = line.split("\\s+");
            String command = data[0];
            switch (command) {
                case "Change":
                    input = input.replace(data[1], data[2]);
                    System.out.println(input);
                    break;
                case "Includes":
                    boolean isTrue = input.contains(data[1]);
                    if(isTrue){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case "End":
                    boolean ends =  input.endsWith(data[1]);
                    if(ends){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    input = input.toUpperCase(Locale.ROOT);
                    System.out.println(input);
                    break;
                case "FindIndex":
                    int index = input.indexOf(data[1]);
                    System.out.println(index);
                    break;
                case "Cut":
                    int start = Integer.parseInt(data[1]);
                    int end = Integer.parseInt(data[2]);
                    input = input.substring(start, start + end);
                    System.out.println(input);

                    break;
            }
            line = scanner.nextLine();
        }
        System.out.println();
    }
}
