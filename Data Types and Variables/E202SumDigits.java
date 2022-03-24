package Exercise2;
import java.util.Scanner;
public class E202SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int sum = 0;
        for (int i = 0; i < input.length() ; i++) {

            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;

        }
        System.out.println(sum);
    }
}
