package Excercise4_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class E409PalindromeInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("END")) {
            String[] items = input.split("");
            int[] palindrome = Arrays.stream(items).mapToInt(Integer::parseInt).toArray();
            int[] reverse = new int[palindrome.length];
            for (int i = 0; i < reverse.length; i++) {
                reverse[i] = palindrome[palindrome.length - 1 - i];
            }
            boolean isPalindrome = Arrays.equals(palindrome, reverse);

            if (isPalindrome) {
                isPalindrome = true;

                System.out.println("true");
            }else{
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }}







