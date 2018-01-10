package by.katomakhina.task3dot3.service.impl;

import by.katomakhina.task3dot3.dao.DAOFactory;
import by.katomakhina.task3dot3.dao.exception.DAOException;
import by.katomakhina.task3dot3.entity.Candy;
import by.katomakhina.task3dot3.service.CandyService;
import by.katomakhina.task3dot3.service.exception.ServiceException;

import java.util.List;

public class CandyServiceImpl implements CandyService {
    @Override
    public List<Candy> parse(String command) throws ServiceException {
        DAOFactory instance = DAOFactory.getInstance();
        try {
            return instance.getCandyDAO().parse(command);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
