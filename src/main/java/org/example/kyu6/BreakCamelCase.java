package org.example.kyu6;

import java.util.List;

public class BreakCamelCase {

    public static String camelCase(String input) {

        String result = "";

        List<String> inputAsArray = List.of(input.split(""));

        for (int i = 0; i < inputAsArray.size(); i++) {

            String currentCharacter = inputAsArray.get(i);
            String currentCharacterAsUpperCase = inputAsArray.get(i).toUpperCase();

            if (!currentCharacter.equals(currentCharacterAsUpperCase)) {

                result += currentCharacter;

            } else  {

                if (i != inputAsArray.size() - 1) {
                    result += " ";
                }

                result += currentCharacter;
            }

        }

        return result;
    }

}
