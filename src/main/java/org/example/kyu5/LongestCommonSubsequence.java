package org.example.kyu5;

public class LongestCommonSubsequence {

    public static String lcs(String x, String y) {
        // your code here

        String result = "";

        String[] xAsArray = x.split("");
        String[] yAsArray = y.split("");

        int xPointer = 0;
        int yPointer = 0;

        while (xPointer < xAsArray.length && yPointer < yAsArray.length) {

            String xCharacter = xAsArray[xPointer];
            String yCharacter = yAsArray[yPointer];

            if (xCharacter.equals(yCharacter)) {
                result += xCharacter;
                xPointer += 1;
                yPointer += 1;
            } else {
                if (!x.substring(xPointer).contains(yCharacter)){
                    yPointer +=1;
                } else {
                    xPointer += 1;
                }
            }

        }

        return result;
    }
}
