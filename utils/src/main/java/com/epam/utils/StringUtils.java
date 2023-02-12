package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //code!
        if (str == null) {
            return false;
        }

        try {
            double number = Double.parseDouble(str);

            if (number > 0) {
                return true;
            }

            return false;

        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
