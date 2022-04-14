package Excercise8_TextProcessing;
import java.util.Scanner;
public class E808LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        double sum = 0;
        for (String s : input) {
            char letterBefore = s.charAt(0);
            char letterAfter = s.charAt(s.length() -1);
            String digits = s.substring(1, s.length() - 1);
            double number = Double.parseDouble(digits);

            if(Character.isUpperCase(letterBefore)){
                sum += number / getAlphabetPosiotion(letterBefore);
            }else{
                sum += number * getAlphabetPosiotion(letterBefore);
            }

            if(Character.isUpperCase(letterAfter)){
                sum -= getAlphabetPosiotion(letterAfter);
            }else{
                sum += getAlphabetPosiotion(letterAfter);
            }

        }
        System.out.printf("%.2f", sum);
    }

    static int getAlphabetPosiotion(char c){
        return Character.toLowerCase(c) -96;
    }
}
