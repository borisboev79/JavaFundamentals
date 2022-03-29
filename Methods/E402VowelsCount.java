package Excercise4_Methods;


import java.util.Scanner;

public class E402VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printVowelsCount(text);
    }

    public static void printVowelsCount(String text) {
        int vowelCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.toLowerCase().charAt(i);

            if (symbol == 97 || symbol == 101
                    || symbol == 105 || symbol == 111
                    || symbol == 117) {
                vowelCount++;
            }

        }
        System.out.println(vowelCount);
    }
}
