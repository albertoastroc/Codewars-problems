package org.example.kyu6;

import java.math.BigInteger;

public class IsPrime {

    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        int squareRoot = (int) Math.sqrt(num);

        for (int i = 2; i <= squareRoot; i++) {

            if (num % i == 0 && i != num) {
                return false;
            }

        }

        return true;

    }

}
