package Exercise2;
import java.util.Scanner;
public class E207WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int tank = 0;
        for (int i = 0; i < number ; i++) {
            int load = Integer.parseInt(scanner.nextLine());
            if (tank + load <= 255){
                tank += load;
            }else{
                System.out.println("Insufficient capacity!");

            }
        }
        System.out.println(tank);
    }
}
