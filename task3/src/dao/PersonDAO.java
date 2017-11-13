package dao;

import entity.Person;

import java.sql.SQLException;

public interface PersonDAO {
    Person find(String ... args) throws SQLException;
}
