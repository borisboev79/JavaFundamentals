package Excercise8_TextProcessing;

import java.util.*;

public class E801ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split(", "))
                .filter(E801ValidUsernames::isValid)
                .forEach(System.out::println);


    }

    static boolean isValid(String username) {
        return username.matches("[a-zA-Z0-9\\-_]{3,16}");
    }


}