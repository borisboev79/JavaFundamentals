package Excercise7_AssotiativeArrays;
import java.util.*;
public class E708CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> users = new LinkedHashMap<>();
        String line = scanner.nextLine();
        while(!line.equals("End")){
            String[] data = line.split("\\s+->\\s+");

            users.putIfAbsent(data[0], new ArrayList<>());
            if(!users.get(data[0]).contains(data[1])){
               users.get(data[0]).add(data[1]);
            }

            line = scanner.nextLine();
        }
        users.forEach((k,v) -> {

            System.out.println(k);

            for(String u : v){
                System.out.printf("-- %s%n", u);
            }


        });


    }
}
