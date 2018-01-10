package by.katomakhina.task3dot3.controller.validator;

public final class PageParamValidator {
    private static final String REGEX_PARAM = "[1-9][0-9]*";

    private PageParamValidator() {
    }

    public static boolean isValidPageParam(String param, int maxValue) {
        if (param != null && param.matches(REGEX_PARAM)) {
            if (Integer.parseInt(param) <= maxValue) {
                return true;
            }
        }
        return false;
    }
}
