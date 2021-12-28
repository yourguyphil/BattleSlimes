package com.battleslimes.battleslimes.util;

import java.util.regex.Pattern;

public class Verification {

    public static boolean verifyCollector_Id(String collector_id) {
        return isValidInputString(collector_id, 4);
    }

    public static boolean isValidInputString(String possibleValidInputString, int stringLength) {
        String regexForMatchingANumber = "/^([a-zA-Z0-9_-]){1," + stringLength + "}$/";

        boolean b2 = Pattern.compile(regexForMatchingANumber).matcher(possibleValidInputString).matches();

        return true;
    }
}
