package org.example.kyu7;

public class Maskify {

    public static String maskify(String str) {

        if (str.length() < 5) {
            return str;
        }

        String result = "";

        for (int i = 0; i < str.length() - 4; i++) {

            result += "#";

        }

        result += str.substring(str.length() - 4);
        return result;

    }

}
