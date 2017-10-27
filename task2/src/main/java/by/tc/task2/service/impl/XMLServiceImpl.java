package by.tc.task2.service.impl;

import by.tc.task2.dao.DAOFactory;
import by.tc.task2.dao.XMLDAO;
import by.tc.task2.entity.Entity;
import by.tc.task2.service.XMLService;

import java.io.IOException;

public class XMLServiceImpl implements XMLService {
    public Entity parseXML() throws IOException {
        DAOFactory factory = DAOFactory.getInstance();
        XMLDAO entity = factory.getXMLDAO();
        return entity.parseXML();
    }
}
