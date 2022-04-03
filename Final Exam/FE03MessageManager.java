package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FE03MessageManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        Map<String, User> users = new LinkedHashMap<>();
        String line = scanner.nextLine();
        while (!line.equals("Statistics")) {
            String[] data = line.split("=");
            String command = data[0];
            switch (command) {
                case "Add":
                    handleAdd(users, data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]));
                    break;
                case "Message":
                    handleMessage(users, capacity, data[1], data[2]);
                    break;
                case "Empty":
                    handleEmpty(users, data[1]);
                    break;

            }
            line = scanner.nextLine();
        }

        System.out.printf("Users count: %d%n", users.size());

        for(Map.Entry<String, User> user : users.entrySet()){
            System.out.printf("%s - %d%n",user.getKey(), user.getValue().getSent() + user.getValue().getReceived());
        }

    }

    private static void handleEmpty(Map<String, User> users, String name) {
        if(!name.equals("All")){
            users.remove(name);
        }else{
            users.clear();
        }
    }

    private static void handleMessage(Map<String, User> users, int capacity, String sender, String receiver) {
        if(users.containsKey(sender) && users.containsKey(receiver)){
            users.get(sender).setSent(users.get(sender).getSent() + 1);
            users.get(receiver).setReceived(users.get(receiver).getReceived() + 1);
            if(users.get(sender).getSent() + users.get(sender).getReceived() >= capacity){
                users.remove(sender);
                System.out.printf("%s reached the capacity!%n", sender);
            }
            if(users.get(receiver).getReceived() + users.get(receiver).getSent() >= capacity){
                users.remove(receiver);
                System.out.printf("%s reached the capacity!%n", receiver);
            }

        }
    }

    private static void handleAdd(Map<String, User> users, String name, int sent, int received) {
        users.putIfAbsent(name, new User(name, sent, received));


    }

    static class User {
        String name;
        int sent;
        int received;

        public User(String name, int sent, int received) {
            this.name = name;
            this.sent = sent;
            this.received = received;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSent() {
            return sent;
        }

        public void setSent(int sent) {
            this.sent = sent;
        }

        public int getReceived() {
            return received;
        }

        public void setReceived(int received) {
            this.received = received;
        }
    }


}
