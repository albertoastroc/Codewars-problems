package org.example.kyu7;

public class ValidatePinCode {

    public static boolean validatePin(String pin) {

        int pinLength = pin.length();

        if (pinLength < 4 || pinLength > 6 || pinLength == 5) {
            return false;
        }

        char[] pinAsArray = pin.toCharArray();

        for (int i = 0; i < pinAsArray.length; i++) {

            Character currentCharacter = pinAsArray[i];

            if (!Character.isDigit(currentCharacter)) {
                return false;
            }
        }



        // Your code here...
        return true;
    }

}
