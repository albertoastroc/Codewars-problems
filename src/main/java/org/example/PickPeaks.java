package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {

    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        // Your code here!

        //Initialize string for peak index
        //Initialize list for peak value

        //Loop through the array
        //Find the first item that is bigger than the previous item, that becomes temporary peak
        //Continue checking numbers with every bigger number becoming peak, if it's the same peak stays the same
        //When a bigger number is found peak index changes to that number's index
        //If the following number is the same peak index doesn't change
        //When smaller number is found save peak information

        Map<String, List<Integer>> result = new HashMap<>();
        result.put("pos", new ArrayList<>());
        result.put("peaks", new ArrayList<>());

        int tempIndex = 0;
        int tempPeakValue = 0;

        System.out.println(arr.length);

        for (int i = 0; i < arr.length - 1; i++) {

            int pointer1 = arr[i];
            int pointer2 = arr[i + 1];

            if (pointer2 > pointer1){

                tempIndex = i + 1;
                tempPeakValue = pointer2;

            }

            if (pointer2 < pointer1 && tempIndex > 0) {

                List<Integer> tempPosList = result.get("pos");
                tempPosList.add(tempIndex);
                result.put("pos", tempPosList);


                List<Integer> tempPeaksList = result.get("peaks");
                tempPeaksList.add(tempPeakValue);
                result.put("peaks", tempPeaksList);

                tempIndex = 0;

            }


        }



        return result;
    }

}