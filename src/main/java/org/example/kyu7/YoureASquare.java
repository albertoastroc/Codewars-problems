package org.example.kyu7;

public class YoureASquare {

    public static boolean isSquare(int n) {

        double result = Math.sqrt(n);

        return result == Math.floor(result);
    }

}