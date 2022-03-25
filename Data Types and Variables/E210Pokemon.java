package Exercise2;
import java.util.Scanner;
public class E210Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());
        double halfN = N * 0.5;
        int targets = 0;
        while(N >= M){
            N -= M;
            targets ++;
            if(N == halfN && Y != 0){
                N /= Y;

            }
        }
        System.out.println(N);
        System.out.println(targets);
    }
}
