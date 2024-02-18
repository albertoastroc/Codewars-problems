package org.example.kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisemvowelTrolls {

    public static String problem(String str) {

        List<String> vowels = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
        String result = "";

        for (int i = 0; i < str.length(); i++) {

           String currentLetter = String.valueOf(str.charAt(i));
            if (!vowels.contains(currentLetter.toLowerCase())) {
                result += currentLetter;
            }

        }

        return result;

    }

}