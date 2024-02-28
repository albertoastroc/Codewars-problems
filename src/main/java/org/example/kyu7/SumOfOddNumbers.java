package org.example.kyu7;

public class SumOfOddNumbers {

    public static int rowSumOddNumbers(int n) {

        if (n == 1) {
            return 1;
        }

        int firstNumberOfRow = (n * (n - 1) )+ 1;

        int result = 0;

        for (int i = 1; i < n; i++) {

            result += i * 2;

        }

        int sumOfRow = (firstNumberOfRow * n) + result;


        return sumOfRow;
        //TODO
    }

}
