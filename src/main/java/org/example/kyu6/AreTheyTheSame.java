package org.example.kyu6;

import java.util.HashMap;
import java.util.Map;

public class AreTheyTheSame {

    public static boolean comp(int[] a, int[] b) {

        if (a == null || b == null){
            return false;
        }

        if (a.length == 0 && b.length == 0){
            return true;
        }

        if (a.length != b.length) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < b.length; i++) {

            int currentBNumber = b[i];

            if (!map.containsKey(currentBNumber)){
                map.put(currentBNumber, 1);
            } else {
                int currentBNumberCount = map.get(currentBNumber);
                map.put(currentBNumber, currentBNumberCount + 1);
            }

        }

        for (int i = 0; i < a.length; i++) {

            int currentNumSquared = a[i] * a[i];
            if (!map.containsKey(currentNumSquared)) {
                return false;
            }
            else {
                int currentBNumberCount = map.get(currentNumSquared);
                map.put(currentNumSquared, currentBNumberCount - 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {

            if (entry.getValue() != 0) {
                return false;
            }

        }

        return true;
    }

}
