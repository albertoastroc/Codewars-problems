package org.example.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTheOdd {

    public static int[] sortArray(int[] array) {

        List<Integer> listOfOdds = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {

                listOfOdds.add(array[i]);
            }

        }

        Collections.sort(listOfOdds);

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {

                array[i] = listOfOdds.get(0);
                listOfOdds.remove(0);
            }

        }

        return array;
    }

}
