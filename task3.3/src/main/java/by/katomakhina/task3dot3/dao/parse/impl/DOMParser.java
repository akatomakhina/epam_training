package by.katomakhina.task3dot3.dao.parse.impl;

import by.katomakhina.task3dot3.dao.parse.Command;
import by.katomakhina.task3dot3.dao.parse.help.CandyDOMParser;
import by.katomakhina.task3dot3.entity.Candy;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.List;

public class DOMParser implements Command {
    private static final String PATH = "/candies/candies.xml";

    @Override
    public List<Candy> execute() throws IOException, SAXException {
        return CandyDOMParser.doParsing(PATH);
    }
}
