package Lab10_FinalExamPreparation;

import java.util.Scanner;

public class E1014WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stops = new StringBuilder(scanner.nextLine());
        String line = scanner.nextLine();
        while (!line.equals("Travel")) {
            String[] data = line.split(":");
            String command = data[0];
            switch (command) {

                case "Add Stop":
                    int index = Integer.parseInt(data[1]);
                    String text = data[2];
                    if(isValid(index, stops)){
                    stops.insert(index, text);
                }
                    System.out.println(stops.toString());
                    break;
                case "Remove Stop":
                    int start = Integer.parseInt(data[1]);
                    int end = Integer.parseInt(data[2]);
                    if(isValid(start, stops) && isValid(end, stops)) {
                        stops.replace(start, end + 1, "");
                    }
                    System.out.println(stops.toString());
                    break;
                case "Switch":
                    String oldSubstring = data[1];
                    String newSubstring = data[2];

                    String temp = stops.toString().replace(oldSubstring, newSubstring);
                    stops.setLength(0);
                    stops.append(temp);
                    System.out.println(stops.toString());
                    break;
            }

            line = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s%n", stops.toString());
    }
    static boolean isValid(int index, StringBuilder sequence){
        if(index >=0 && index < sequence.length()){
            return true;
        }
        return false;
    }
}
