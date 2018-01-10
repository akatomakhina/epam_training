package by.katomakhina.task3dot3.dao;

import by.katomakhina.task3dot3.dao.impl.CandyDAOImpl;

public class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    private CandyDAO candyDAO = new CandyDAOImpl();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public CandyDAO getCandyDAO() {
        return candyDAO;
    }
}
