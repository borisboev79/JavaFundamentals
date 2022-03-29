package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E309KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int bestDigit = 0;
        int maxSum = 0;
        int maxLength = 0;
        int bestSample = 0;
        int[] bestDNA = new int[length];
        String input = scanner.nextLine();
        int sample = 1;
        while (!input.equals("Clone them!")) {
            int[] DNA = Arrays.stream(input.split("!+")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            int counter = 1;
            int digit = 0;
            for (int i = 0; i < length; i++) {
                sum += DNA[i];
                if (i != DNA.length - 1) {
                    if (DNA[i] == 1 && DNA[i + 1] == 1) {
                        counter++;
                        digit = i + 1;
                    }
                }
            }
            if (maxLength < counter || (maxLength == counter && digit < bestDigit) || ((maxLength == counter && digit == bestDigit) && maxSum < sum)) {
                maxLength = counter;
                bestDigit = digit;
                maxSum = sum;
                bestSample = sample;
                for (int i = 0; i < length; i++) {
                    bestDNA[i] = DNA[i];
                }
            }
            input = scanner.nextLine();
            sample++;
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSample, maxSum);
        for (int elements : bestDNA) {
            System.out.print(elements + " ");
        }
    }
}
