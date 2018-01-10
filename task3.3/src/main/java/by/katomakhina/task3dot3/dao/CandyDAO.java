package by.katomakhina.task3dot3.dao;

import by.katomakhina.task3dot3.dao.exception.DAOException;
import by.katomakhina.task3dot3.entity.Candy;

import java.util.List;

public interface CandyDAO {
    List<Candy> parse(String command) throws DAOException;
}
