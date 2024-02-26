package org.example.kyu7;

import java.util.List;

public class ComplementaryDNA {

    public static String makeComplement(String dna) {

        //A T
        //C G

        List<String> dnaAsArray = List.of(dna.split(""));

        String result = "";

        for (int i = 0; i < dnaAsArray.size(); i++) {

            String currentLetter = dnaAsArray.get(i);

            if (currentLetter.equals("A")) {
                result += "T";
            } else if (currentLetter.equals("T")) {
                result += "A";
            } else if (currentLetter.equals("G")) {
                result += "C";
            } else if (currentLetter.equals("C")) {
                result += "G";
            }

        }

        //Your code
        return result;
    }

}
