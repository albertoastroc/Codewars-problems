package org.example.kyu7;

import java.util.List;

public class Mumbling {

    public static String accum(String s) {
        // your code

        List<String> stringAsArray = List.of(s.split(""));

        String result = "";

        for (int i = 0; i < stringAsArray.size(); i++) {

            result += stringAsArray.get(i).toUpperCase();

            for (int j = 0; j < i; j++) {

                result += stringAsArray.get(i).toLowerCase();

            }

            if (i != stringAsArray.size() - 1) {
                result += "-";
            }



        }

        return result;
    }

}
