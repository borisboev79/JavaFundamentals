package Exercise2;
import java.util.Scanner;
public class E205PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        for (int i = n1; i <= n2; i++) {
            char symbol = (char)i;
            System.out.print(symbol+ " ");

        }

        }

}
