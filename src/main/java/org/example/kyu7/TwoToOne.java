package org.example.kyu7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        // your code
        String combined = s1 + s2;
       return String.join("", Arrays.stream(combined.split("")).distinct().sorted().toList());

    }

}
