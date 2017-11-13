package service.impl;

import dao.DAOFactory;
import dao.PersonDAO;
import entity.Person;
import service.PersonService;

import java.sql.SQLException;

public class PersonServiceImpl implements PersonService {
    @Override
    public Person find(String ... args) throws SQLException {
        DAOFactory factory = DAOFactory.getInstance();
        PersonDAO personDAO = factory.getPersonDAO();
        Person person = personDAO.find(args);
        return person;
    }
}
