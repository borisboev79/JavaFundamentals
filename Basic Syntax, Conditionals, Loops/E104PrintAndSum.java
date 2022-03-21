package Exercise1;
import java.util.Scanner;

public class E104PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firtsNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int sum = 0;
        for (int i = firtsNumber; i <= secondNumber ; i++) {
            System.out.printf("%d ", i);
            sum += i;


        }
        System.out.println("");
        System.out.printf("Sum: %d", sum);
    }
}
