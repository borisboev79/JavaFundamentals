package Exercise3_Arrays;
import java.util.Scanner;
public class E304ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String[] array = scanner.nextLine().split(" ");
    int rotations = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rotations; i++) {
            String firstElement = array[0];
            // shift all elements but the first one position to the left
            for (int j = 0; j < array.length - 1; j++) {
                array [j] = array[j+1];
                // add first to the last position

            }
            array[array.length -1] = firstElement;
        }
        System.out.println(String.join(" ", array));
    }
}
