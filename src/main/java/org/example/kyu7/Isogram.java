package org.example.kyu7;

import java.util.HashSet;
import java.util.List;

public class Isogram {

    public static boolean  isIsogram(String str) {
        // ...

        List<String> strAsList = List.of(str.split(""));

        HashSet<String> letterSet = new HashSet<>();

        for (int i = 0; i < strAsList.size(); i++) {

            boolean result = letterSet.add(strAsList.get(i).toLowerCase());

            if (!result) {
                return false;
            }

        }

        return true;
    }

}