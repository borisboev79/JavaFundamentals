package Excercise8_TextProcessing;
import java.util.*;
public class E802CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(" ");
        char[] text1 = data[0].toCharArray();
        char[] text2 = data[1].toCharArray();

        int shorter = Math.min(text1.length, text2.length);
        int longer = Math.max(text1.length, text2.length);
        int sum = 0;
        for (int i = 0; i < longer; i++) {
            if(i < shorter ){
               sum += text1[i] * text2[i];
            }else{
                if(text1.length > text2.length) {
                    sum += text1[i];
                }else{
                    sum += text2[i];
                }
            }
        }
        System.out.println(sum);
    }
}
