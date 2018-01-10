package by.katomakhina.task3dot3.dao.parse.impl;

import by.katomakhina.task3dot3.dao.parse.Command;
import by.katomakhina.task3dot3.dao.parse.help.CandySAXParser;
import by.katomakhina.task3dot3.entity.Candy;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.List;

public class SAXParser implements Command {
    private final static String PATH = "/candies/candies.xml";

    @Override
    public List<Candy> execute() throws IOException, SAXException {
        XMLReader reader = XMLReaderFactory.createXMLReader();
        CandySAXParser handler = new CandySAXParser();
        reader.setContentHandler(handler);
        reader.setErrorHandler(handler);
        reader.parse(new InputSource(this.getClass().getResourceAsStream(PATH)));
        /*reader.parse(new InputSource(getClass().getClassLoader().getResourceAsStream(PATH)));*/
        return handler.getCandies();
    }
}
