package org.example.kyu7;

import java.util.List;

public class ShortestWord {

    public static int findShort(String s) {

        List<String> stringAsArray = List.of(s.split(" "));

        int min = stringAsArray.get(0).length();

        for (int i = 1; i < stringAsArray.size(); i++) {

            if (stringAsArray.get(i).length() < min){

                min = stringAsArray.get(i).length();

            }

        }

        return min;



    }

}
