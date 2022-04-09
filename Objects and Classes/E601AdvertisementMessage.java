package Excercise6_ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class E601AdvertisementMessage {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Message message = new Message();
        message.printMessages(num);

    }


    static class Message {
        private String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        private String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        private String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        private String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random random = new Random();

        void printMessages(int messages) {

            for (int i = 0; i < messages; i++) {

                System.out.printf("%s %s %s - %s%n", this.phrases[random.nextInt(this.phrases.length)],
                        this.events[random.nextInt(this.events.length)],
                        this.authors[random.nextInt(this.authors.length)],
                        this.cities[random.nextInt(this.cities.length)]);
            }
        }

    }
}
