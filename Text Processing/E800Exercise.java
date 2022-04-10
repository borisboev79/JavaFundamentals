package Excercise8_TextProcessing;

import java.util.*;

public class E800Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("Boris");
        sb.append(" ");
        sb.append("Boev").append(" ").append(System.lineSeparator()).append("34");
        sb.replace(6, 6, "");

        System.out.println(sb);

    }
}
// substring
// System.out.println(text.substring(4));
// System.out.println(text.substring(0, 4));

//indexOf()
//System.out.println(text.indexOf("T"));

// lastIndexOf()
// System.out.println(text.lastIndexOf("t"));

// contains()
// System.out.println(text.contains("Te"));

// replace()
// System.out.println(text.replace("x", "s"));

// replaceAll()
// System.out.println(text.replaceAll("o", "a"));

// repeat
// System.out.println(text.repeat(3));

// StringBuilder sb = new StringBuilder();
// sb.append("Boris");
// System.out.println(sb);

// sb.append("Boev").append(" ").append(System.lineSeparator()).append("34");
// sb.insert(5, " Slaveev");
// sb.replace(6, 6, "");