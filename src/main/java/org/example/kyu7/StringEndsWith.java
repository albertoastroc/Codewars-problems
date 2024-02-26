package org.example.kyu7;

public class StringEndsWith {

    public static boolean solution(String str, String ending) {

        //Substring out from str based on the size of ending string size
        //Compare substring and ending if they are they same

        if (ending.length() > str.length()) {
            return false;
        }

        if (ending.isEmpty()) {
            return true;
        }

        int endingSize = ending.length();

        String strSubtringEnd = str.substring(str.length() - endingSize);

        return strSubtringEnd.equals(ending);
    }

}
