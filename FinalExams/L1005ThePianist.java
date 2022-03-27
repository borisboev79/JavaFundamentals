package Lab10_FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class L1005ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        Map<String, Piece> music = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = line.split("\\|");
            String title = data[0];
            String composer = data[1];
            String key = data[2];
            if (music.containsKey(title)) {
                System.out.println(title + " is already in the collection!");
            } else {
                music.put(title, new Piece(title, composer, key));
            }
            line = scanner.nextLine();
        }
        while (!line.equals("Stop")) {
            String[] data = line.split("\\|");
            String command = data[0];
            switch (command){
                case "Add":
                    handleAdd(music, data[1], data[2], data[3]);
                    break;
                case "Remove":
                    handleRemove(music, data[1]);
                    break;
                case "ChangeKey":
                    handleChangeKey(music, data[1], data[2]);
                    break;
            }

            line = scanner.nextLine();
        }

        music.values().forEach(System.out::println);
    }

    private static void handleAdd(Map<String, Piece> music, String title, String composer, String key) {
        if(!music.containsKey(title)){
            music.put(title, new Piece(title, composer, key));
            System.out.printf("%s by %s in %s added to the collection!%n", title, composer, key);
        }else{
            System.out.printf("%s is already in the collection!%n", title);
        }

    }

    private static void handleRemove(Map<String, Piece> music, String title) {
        if(music.containsKey(title)){
            music.remove(title);
            System.out.printf("Successfully removed %s!%n", title);
        }else{
            System.out.printf("Invalid operation! %s does not exist in the collection.%n", title);
        }
    }

    private static void handleChangeKey(Map<String, Piece> music, String title, String key) {
        if(music.containsKey(title)){
            music.get(title).setKey(key);
            System.out.printf("Changed the key of %s to %s!%n", title, key);
        }else{
            System.out.printf("Invalid operation! %s does not exist in the collection.%n", title);
        }

    }

    static class Piece {
        String name;
        String composer;
        String key;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getComposer() {
            return composer;
        }

        public void setComposer(String composer) {
            this.composer = composer;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Piece(String name, String composer, String key) {
            this.name = name;
            this.composer = composer;
            this.key = key;
        }

        @Override
        public String toString() {
            return String.format("%s -> Composer: %s, Key: %s", this.name, this.composer, this.key);
        }
    }
}
