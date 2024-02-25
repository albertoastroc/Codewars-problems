package org.example.kyu6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindUniqueNumber {

    public static double findUniq(double arr[]) {
        // Do the magic


        List<Double> firstList = new ArrayList<>();
        List<Double> secondList = new ArrayList<>();

        firstList.add(arr[0]);

        double firstNum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            double currentNumber = arr[i];

            if (firstNum == currentNumber) {
                firstList.add(currentNumber);
            } else {
                secondList.add(currentNumber);
            }

            if (firstList.size() > 1 && !secondList.isEmpty()){
                return secondList.get(0);
            } else if (secondList.size() > 1){
                return firstList.get(0);
            }


        }

        return arr[0];

    }

}