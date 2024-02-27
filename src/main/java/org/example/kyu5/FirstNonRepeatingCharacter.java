package org.example.kyu5;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static String firstNonRepeatingLetter(String s){
        // Add your code here

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        String[] inputAsCharArray = s.split("");

        for (int i = 0; i < inputAsCharArray.length; i++) {

            String currentLetter = String.valueOf(inputAsCharArray[i]);

            if (!map.containsKey(currentLetter.toLowerCase()) && !map.containsKey(currentLetter.toUpperCase())) {
                map.put(currentLetter, 1);
            } else {
                map.put(currentLetter.toLowerCase(), 2);
                map.put(currentLetter.toUpperCase(), 2);
            }

        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {

                return String.valueOf(entry.getKey());
            }

        }

        return "";

    }

}
