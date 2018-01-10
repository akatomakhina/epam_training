package by.katomakhina.task3dot3.dao.parse;

import by.katomakhina.task3dot3.entity.Candy;
import org.xml.sax.SAXException;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;

public interface Command {
    List<Candy> execute() throws SAXException, IOException, XMLStreamException;
}
