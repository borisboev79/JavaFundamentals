package Exercise1;
import java.util.Scanner;

public class E110PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double lightsaberCount = Math.ceil(students * 1.10);
        int beltCount = students - students / 6;
        double totalPrice = students * robePrice + lightsaberPrice * lightsaberCount + beltCount * beltPrice;
        if(money >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }else{
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - money);
        }


    }
}
