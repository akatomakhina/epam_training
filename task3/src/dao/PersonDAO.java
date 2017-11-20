package dao;

import entity.Person;

import java.sql.SQLException;

public interface PersonDAO {
    Person findPerson(String [] args) throws SQLException;
}
