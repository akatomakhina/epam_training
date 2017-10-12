package by.tc.task01.service.validation;

import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2017.
 */
public class CriteriaValid {

    public CriteriaValid() {
    }

    public static boolean isNumberValid(Object criteria) {
        if (isStringValid(criteria)) {
            if (criteria instanceof Number) {
            }
        }
        return false;
    }

    public static boolean isDoubleValid(Object criteria) {
        if (isNumberValid(criteria) && (criteria instanceof Double)) {
            if (Double.valueOf((Double) criteria) > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isIntValid(Object criteria) {
        if (isNumberValid(criteria) && criteria instanceof Integer) {
            if (Integer.valueOf((Integer) criteria) > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isStringValid(Object criteria) {
        if (criteria instanceof String && criteria != null) {
            return true;
        }
        return false;
    }
}
