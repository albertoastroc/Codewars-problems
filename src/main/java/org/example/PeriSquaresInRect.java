package org.example;

import java.math.BigInteger;
import java.util.Objects;

public class PeriSquaresInRect {

    public static BigInteger perimeter(BigInteger n) {

        BigInteger result = new BigInteger("0");
        BigInteger total = new BigInteger("0");


        if (Objects.equals(n, BigInteger.valueOf(1))) {

            result = result.add(BigInteger.valueOf(4));
            return result;

        }

        if (Objects.equals(n, BigInteger.valueOf(0))){

            return result;

        }

        BigInteger prev = new BigInteger("0");
        BigInteger current = new BigInteger("1");

        for (int i = 0; i < n.intValue() + 1; i++) {


            total = total.add(current);

            result = prev.add(current);

            prev = current;
            current = result;

        }


        //return result.multiply(BigInteger.valueOf(4));
        return total.multiply(BigInteger.valueOf(4));

    }

}
