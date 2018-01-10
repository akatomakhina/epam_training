package by.katomakhina.task3dot3.dao.parse;

import by.katomakhina.task3dot3.dao.parse.impl.DOMParser;
import by.katomakhina.task3dot3.dao.parse.impl.SAXParser;
import by.katomakhina.task3dot3.dao.parse.impl.StAXParser;

import java.util.HashMap;
import java.util.Map;

public class CommandDirector {
    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandDirector() {
        commands.put(CommandName.SAX, new SAXParser());
        commands.put(CommandName.StAX, new StAXParser());
        commands.put(CommandName.DOM, new DOMParser());
    }

    public Command takeCommand(String name) {
        CommandName commandName = CommandName.valueOf(name);
        return commands.get(commandName);
    }
}
