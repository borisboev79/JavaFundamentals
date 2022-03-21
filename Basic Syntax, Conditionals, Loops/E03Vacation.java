package Exercise1;

import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupSize = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String weekday = scanner.nextLine();
        double price = 0;
        double discount = 1.0;
       // double groupPrice = price * groupSize * discount;
        switch (type) {
            case "Students":
                if (groupSize >= 30) {
                    discount = 0.85;
                }
                switch (weekday) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }break;
            case "Business":
                if (groupSize >= 100) {
                    groupSize -= 10;
                }
                switch (weekday) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16.00;
                        break;
                }break;
            case "Regular":
                if (groupSize >= 10 && groupSize <= 20) {
                    discount = 0.95;
                }
                switch (weekday) {
                    case "Friday":
                        price = 15.0;
                        break;
                    case "Saturday":
                        price = 20.0;
                        break;
                    case "Sunday":
                        price = 22.50;
                        break;
                }break;
        }
        double groupPrice = price * groupSize * discount;
        System.out.printf("Total price: %.2f", groupPrice);
    }
    }


