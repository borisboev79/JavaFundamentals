package Excercise7_AssotiativeArrays;


import java.util.*;

public class E705SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parkingRegister = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {

            String[] data = scanner.nextLine().split("\\s+");
            String command = data[0];
            String name = data[1];

            if (command.equals("register")) {
                String carPlate = data[2];
                if (parkingRegister.containsKey(name)) {
                    System.out.println("ERROR: already registered with plate number " + carPlate);
                } else {
                    parkingRegister.putIfAbsent(name, carPlate);
                    System.out.println(name + " registered " + carPlate + " successfully");
                }
            }else{
                if (parkingRegister.containsKey(name)) {
                    parkingRegister.remove(name);
                    System.out.println( name + " unregistered successfully");
                } else {
                    System.out.println("ERROR: user " + name + " not found");
                }
            }

        }
        parkingRegister.forEach((k,v) -> System.out.printf("%s => %s%n", k, v));
    }
}
