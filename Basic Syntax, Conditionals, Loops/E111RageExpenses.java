package Exercise1;
import java.util.Scanner;
public class E111RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headset = Double.parseDouble(scanner.nextLine());
        double mouse = Double.parseDouble(scanner.nextLine());
        double keyboard = Double.parseDouble(scanner.nextLine());
        double display = Double.parseDouble(scanner.nextLine());
        double expenses = 0;
        int keyboardCount = 0;
        for (int i = 1; i <= lostGames; i++) {
            if(i % 2 == 0){
                expenses += headset;
            }
            if (i % 3 == 0){
                expenses += mouse;
            }
            if(i % 2 == 0 && i % 3 == 0){
                expenses += keyboard;
                keyboardCount ++;
                if (keyboardCount % 2 == 0){
                    expenses += display;
                }
            }

        }
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
