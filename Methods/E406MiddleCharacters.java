package Excercise4_Methods;
import java.util.Scanner;
public class E406MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printMiddleChars(text);
    }
    public static void printMiddleChars(String text){
        if(text.length() % 2 == 0){
            System.out.print(text.charAt(text.length() / 2 - 1));
            System.out.print(text.charAt(text.length() / 2 ));
        }
        else{
            System.out.println(text.charAt(text.length() / 2 ));
        }
    }
}

