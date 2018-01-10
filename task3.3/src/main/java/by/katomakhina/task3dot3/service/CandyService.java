package by.katomakhina.task3dot3.service;

import by.katomakhina.task3dot3.entity.Candy;
import by.katomakhina.task3dot3.service.exception.ServiceException;

import java.util.List;

public interface CandyService {
    List<Candy> parse(String command) throws ServiceException;
}
