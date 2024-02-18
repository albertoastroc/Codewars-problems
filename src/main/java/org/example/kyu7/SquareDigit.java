package org.example.kyu7;

public class SquareDigit {

    public int squareDigits(int n) {
        // TODO Implement me

        String nAsString = String.valueOf(n);
        String resultAsString = "";

        for (int i = 0; i < nAsString.length(); i++) {

            int squared = Integer.parseInt(String.valueOf(nAsString.charAt(i)));
            squared = squared * squared;

            resultAsString += squared;

        }

        return Integer.parseInt(resultAsString);

    }

}