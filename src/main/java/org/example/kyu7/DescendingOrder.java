package org.example.kyu7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {

    public static int sortDesc(final int num) {

        List<Integer> numAsArray = new ArrayList<>();
        String numAsString = String.valueOf(num);

        for (int i = 0; i < numAsString.length(); i++) {

            int currentNum = Character.getNumericValue(numAsString.charAt(i));
            numAsArray.add(currentNum);

        }

        numAsArray = numAsArray.stream().sorted().collect(Collectors.toList());
        Collections.reverse(numAsArray);

        String result = "";

        for (int i = 0; i < numAsArray.size(); i++) {

            result += Integer.valueOf(numAsArray.get(i));

        }


        return Integer.parseInt(result);
    }

}