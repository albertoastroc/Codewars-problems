package org.example.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EqualSidesOfAnArray {

    public static int findEvenIndex(int[] arr) {
        // your code

        //ArrayL 0 1   101 151 100 101 102 0
        //ArrayR 0 102 101 1  -49  2   1   0

        //ArrayL 0 1  3  6  10 13 15 16 0
        //ArrayR 0 16 15 13 10 6  3  1  0

        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int k = i + 1; k < arr.length; k++) {
                rightSum += arr[k];
            }

            System.out.println(Arrays.toString(arr));
            System.out.println("Left sum " + leftSum);
            System.out.println("Right sum " + rightSum);
            System.out.println(" ");

            if (leftSum == rightSum) {
                return i;
            }



        }
        return -1;
    }

}
