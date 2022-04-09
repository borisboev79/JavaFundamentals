package Excercise7_AssotiativeArrays;
import java.util.*;
public class E710SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> submissions = new LinkedHashMap<>();
        Map<String, Integer> students = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while(!line.equals("exam finished")){

            String[] data = line.split("-");
            String name = data[0];

            if(!line.contains("banned")){

                String language = data[1];
                int points = Integer.parseInt(data[2]);

                submissions.putIfAbsent(language, 0);
                submissions.put(language, submissions.get(language) + 1);

                students.putIfAbsent(name, 0);
                if(students.get(name) < points) {
                    students.put(name, points);
                }

            }else{
                students.remove(name);
            }

            line = scanner.nextLine();

        }
        System.out.println("Results:");
        students.forEach((k,v) -> System.out.println(k + " | " + v));
        System.out.println("Submissions:");
        submissions.forEach((k,v) -> System.out.println(k + " - " + v));

    }

}
