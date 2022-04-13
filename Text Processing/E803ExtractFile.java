package Excercise8_TextProcessing;
import java.util.Scanner;
public class E803ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        String filename = filePath.substring(filePath.lastIndexOf("\\") +1, filePath.indexOf("."));
        String extension = filePath.substring(filePath.lastIndexOf(".") +1);
        System.out.println("File name: " + filename);
        System.out.println("File extension: " + extension);
    }
}
