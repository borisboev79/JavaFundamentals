package Excercise7_AssotiativeArrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class E700Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Bobi", "+359877807059");
        phoneBook.put("Rusi", "+359977807055");
        phoneBook.put("Leni", "+359877807041");

        //интересни печати enty съдържа key + value
        phoneBook.entrySet().forEach(((entry -> System.out.printf("Name: %s --- Phone: %s%n", entry.getKey(), entry.getValue()) )  ));
        // алтернативно може да запишем
        phoneBook.forEach((key, value) -> System.out.printf("Name: %s --- Phone: %s%n", key, value));
        // интересен метод е .containsValue - връща булеви отговор



    }

}
