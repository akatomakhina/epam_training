package by.katomakhina.task3dot3.dao.impl;

import by.katomakhina.task3dot3.dao.CandyDAO;
import by.katomakhina.task3dot3.dao.exception.DAOException;
import by.katomakhina.task3dot3.dao.parse.CommandDirector;
import by.katomakhina.task3dot3.entity.Candy;
import org.xml.sax.SAXException;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;

public class CandyDAOImpl implements CandyDAO {
    @Override
    public List<Candy> parse(String command) throws DAOException {
        CommandDirector commandDirector = new CommandDirector();
        try {
            return commandDirector.takeCommand(command).execute();
        } catch (SAXException | IOException | XMLStreamException e) {
            throw new DAOException(e);
        }
    }
}
