package dao;

import dao.impl.PersonDAOImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    private final PersonDAO personDAO = new PersonDAOImpl();

    private DAOFactory() {
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }

    public static DAOFactory getInstance() {
        return instance;
    }
}
