package service;

import entity.Person;

import java.sql.SQLException;

public interface PersonService {
    Person findPerson(String [] args) throws SQLException;
}
