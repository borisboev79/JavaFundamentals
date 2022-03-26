package Lab10_FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E1011NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();
        String line = scanner.nextLine();


        for (int i = 0; i < n; i++) {

            String[] data = line.split("\\|");
            String carBrand = data[0];
            int mileage = Integer.parseInt(data[1]);
            int fuel = Integer.parseInt(data[2]);

            cars.putIfAbsent(carBrand, new Car(carBrand, mileage, fuel));
            line = scanner.nextLine();
        }


        while (!line.equals("Stop")) {
            String[] data = line.split(" : ");
            String command = data[0];
            String carName = data[1];

            switch (command) {
                case "Drive":
                    handleDrive(cars, carName, Integer.parseInt(data[2]), Integer.parseInt(data[3]));
                    break;
                case "Refuel":
                    handleRefuel(cars, carName, Integer.parseInt(data[2]));
                    break;
                case "Revert":
                    handleRevert(cars, carName, Integer.parseInt(data[2]));
                    break;
            }
            line = scanner.nextLine();
        }
        cars.values().forEach(System.out::println);
    }

    private static void handleRevert(Map<String, Car> cars, String carName, int mileage) {
        if (cars.get(carName).getMileage() - mileage < 10000) {
            cars.get(carName).setMileage(10000);
        } else {
            cars.get(carName).setMileage(cars.get(carName).getMileage() - mileage);
            System.out.printf("%s mileage decreased by %d kilometers%n", carName, mileage);
        }
    }

    private static void handleRefuel(Map<String, Car> cars, String carName, int fuel) {
        if (cars.get(carName).getFuel() + fuel >= 75) {
            int fuelBefore = cars.get(carName).getFuel();
            cars.get(carName).setFuel(75);
            System.out.printf("%s refueled with %d liters%n", carName, 75 - fuelBefore);
        } else {
            cars.get(carName).setFuel(cars.get(carName).getFuel() + fuel);
            System.out.printf("%s refueled with %d liters%n", carName, fuel);
        }

    }

    private static void handleDrive(Map<String, Car> cars, String carName, int distance, int fuel) {

        if (cars.get(carName).getFuel() < fuel) {
            System.out.println("Not enough fuel to make that ride");
        } else {

            cars.get(carName).setMileage(cars.get(carName).getMileage() + distance);
            cars.get(carName).setFuel(cars.get(carName).getFuel() - fuel);
            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carName, distance, fuel);
            if (cars.get(carName).getMileage() >= 100000) {
                System.out.printf("Time to sell the %s!%n", carName);
                cars.remove(carName);
            }
        }


    }

    static class Car {
        String make;
        int mileage;
        int fuel;

        public Car(String make, int mileage, int fuel) {
            this.make = make;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        @Override
        public String toString() {
            return String.format("%s -> Mileage: %d kms, Fuel in the tank: %d lt.", this.make, this.mileage, this.fuel);
        }
    }
}

