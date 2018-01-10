package by.katomakhina.task3dot3.dao.parse.impl;

import by.katomakhina.task3dot3.dao.parse.Command;
import by.katomakhina.task3dot3.dao.parse.help.CandyStAXParser;
import by.katomakhina.task3dot3.entity.Candy;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class StAXParser implements Command {
    private static final String PATH = "/candies/candies.xml";

    @Override
    public List<Candy> execute() throws FileNotFoundException, XMLStreamException {
        XMLInputFactory instance = XMLInputFactory.newInstance();
        InputStream inputStream = this.getClass().getResourceAsStream(PATH);

        XMLStreamReader reader = instance.createXMLStreamReader(inputStream);
        return CandyStAXParser.parse(reader);
    }
}
