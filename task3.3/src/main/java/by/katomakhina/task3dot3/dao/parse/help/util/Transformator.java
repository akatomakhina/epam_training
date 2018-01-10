package by.katomakhina.task3dot3.dao.parse.help.util;

public class Transformator {
    private Transformator() {
    }

    public static String getEnumFromString(String string) {
        return string.trim().toUpperCase().replace("-", "_");
    }
}
