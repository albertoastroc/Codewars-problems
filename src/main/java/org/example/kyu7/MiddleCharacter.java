package org.example.kyu7;

import java.util.List;

public class MiddleCharacter {

    public static String getMiddle(String word) {
        //Code goes here!

        int length = word.length();
        boolean isOdd = length % 2 != 0;

        List<String> wordAsList = List.of(word.split(""));

        String middleCharacter = wordAsList.get(wordAsList.size() / 2);

        System.out.println(middleCharacter);

        if (isOdd) {

            return middleCharacter;

        } else {

            return wordAsList.get(wordAsList.size() / 2 - 1) +middleCharacter;

        }
    }

}