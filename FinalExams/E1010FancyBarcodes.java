package Lab10_FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E1010FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String barcode = "";
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            Pattern pattern = Pattern.compile("@[#]+(?<barcode>[A-Z][A-Za-z\\d]{4,}[A-Z])@[#]+");
            Matcher matcher = pattern.matcher(line);

            StringBuilder sb = new StringBuilder();

            if (matcher.find()) {
                barcode = matcher.group("barcode");

                Pattern digits = Pattern.compile("\\d");
                Matcher digitMatch = digits.matcher(barcode);

                while(digitMatch.find()){
                    sb.append(digitMatch.group());
                }
                if(sb.length() == 0){
                    sb.append("00");
                }
                System.out.printf("Product group: %s%n", sb.toString());
                sb.setLength(0);
            }else{
                System.out.println("Invalid barcode");
            }
        }
    }
}

