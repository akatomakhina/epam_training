package by.katomakhina.task3dot3.dao.parse;

public enum CommandName {
    DOM, SAX, StAX;

    public static boolean isContainsCommand(String command) {
        for (CommandName elem : values()) {
            if (command.equals(elem.name())) {
                return true;
            }
        }
        return false;
    }
}
