package Exercise2;
import java.util.Scanner;
public class E204SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < number; i++) {
            char symbol = scanner.nextLine().charAt(0);
            sum += symbol;


        }
        System.out.printf("The sum equals: %d",sum);
    }
}
