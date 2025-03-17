package org.example.tic_tac_toe_LLD.validator;

public class IntegerValidator {
    public static boolean isInteger(final String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
