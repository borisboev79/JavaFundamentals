package FinalExam;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class FE03DegustationParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, List<String>> people = new LinkedHashMap<>();
        while(!line.equals("Stop")){
            String[] data = line.split("-");
            String command = data[0];
            switch(command) {
                case "Like":
                    String name = data[1];
                    String food = data[2];
                people.putIfAbsent()
                        break;
            }
        }
    }
}
