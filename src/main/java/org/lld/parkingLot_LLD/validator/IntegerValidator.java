package org.lld.parkingLot_LLD.validator;

public class IntegerValidator {
    public static boolean isInteger(final String input) {
        try {
            Integer.valueOf(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
