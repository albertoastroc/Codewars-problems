package org.example.kyu7;

import java.util.ArrayList;
import java.util.List;

public class HighAndLow {

    public static String highAndLow(String numbers) {
        // Code here or

        List<String> numbersAsStringArray = List.of(numbers.split(" "));
        Integer max = Integer.valueOf(numbersAsStringArray.get(0));
        Integer min = Integer.valueOf(numbersAsStringArray.get(0));

        for (int i = 1; i < numbersAsStringArray.size(); i++) {

            int currentNumber = Integer.parseInt(numbersAsStringArray.get(i));
            if (currentNumber > max) {
                max = currentNumber;
            }

            if (currentNumber < min){
                min = currentNumber;
            }

        }

        return (String.valueOf(max) + " " + String.valueOf(min));

    }

}