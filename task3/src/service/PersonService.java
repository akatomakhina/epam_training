package service;

import entity.Person;

import java.sql.SQLException;

public interface PersonService {
    Person find(String ... args) throws SQLException;
}
