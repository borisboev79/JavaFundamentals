package Excercise9_Regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E901Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[>]{2}(?<furniture>[A-Za-z]+)[<]{2}(?<price>[\\d]+\\.?[\\d]*)!(?<quantity>[\\d]+)$");
        List<String> purchases = new LinkedList<>();
        Double totalPrice = 0.0;

        while(!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);
            while(matcher.find()){
                String name = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                double quantity = Double.parseDouble(matcher.group("quantity"));
                purchases.add(name);
                totalPrice += price * quantity;

            }



            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        purchases.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
