package Exercise2;
import java.util.Scanner;
public class E203Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double people = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());
        double courses = Math.ceil(people / elevatorCapacity);
        System.out.printf("%.0f",courses);



    }}

