package Exercise1;

import java.util.Scanner;

public class E07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalSum = 0.00;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.10 || coins == 0.20 || coins == 0.50 || coins == 1.00 || coins == 2.00) {
                totalSum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {

            switch (input) {
                case "Nuts":
                    if (totalSum - 2.0 >= 0) {
                        totalSum -= 2.0;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (totalSum - 0.7 >= 0) {
                        totalSum -= 0.7;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (totalSum - 1.5 >= 0) {
                        totalSum -= 1.5;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (totalSum - 0.8 >= 0) {
                        totalSum -= 0.8;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (totalSum - 1.0 >= 0) {
                        totalSum -= 1.0;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalSum);
    }

}


