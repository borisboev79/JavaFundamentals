package Excercise7_AssotiativeArrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class E702AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resources = new LinkedHashMap<>();
        String resource = scanner.nextLine();
        while(!resource.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            //готин алтернативен запис с метода putIfAbsent

            resources.putIfAbsent(resource, 0);
            resources.put(resource, resources.get(resource) + quantity);

            //закоментирал съм оригиналното решение

          /*  if(!resources.containsKey(resource)){
                resources.put(resource, quantity);
            }else{
                resources.put(resource, resources.get(resource) + quantity);
            }*/

            resource = scanner.nextLine();
        }
        resources.forEach((k, v) -> System.out.printf("%s -> %d%n", k, v));
    }
}
