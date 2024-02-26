package org.example.kyu7;

public class SumOfNumbers {

    public int GetSum(int a, int b) {

        if (a == b) {
            return a;
        }

        boolean biggerB = a < b;

        int total = 0;

        if (biggerB) {

            for (int i = a; i <= b; i++) {

                total += i;

            }

        } else {

            for (int i = a; i >= b; i--) {

                total += i;

            }

        }

        //Good luck!
        return total;
    }

}
