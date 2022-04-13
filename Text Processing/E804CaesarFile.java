package Excercise8_TextProcessing;

import java.util.*;

public class E804CaesarFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char symbol : input) {

            sb.append(String.format("%c", symbol + 55090));
        }
        System.out.println(sb);
    }
}
