package Exercise2;

import java.util.Scanner;

public class E209SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int source = scanner.nextInt();

        int days = 0;
        int totalSpice = 0;

        while (source >= 100) {
            totalSpice += source;
            source -= 10;
            days++;
            if (totalSpice >= 26) {
                totalSpice -= 26;
            }
        }
        if(totalSpice >= 26 && days > 0){
        totalSpice -= 26;}

        System.out.println(days);
        System.out.println(totalSpice);

    }
}
