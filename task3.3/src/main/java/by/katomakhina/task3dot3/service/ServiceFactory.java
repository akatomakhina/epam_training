package by.katomakhina.task3dot3.service;

import by.katomakhina.task3dot3.service.impl.CandyServiceImpl;

public class ServiceFactory {
    private final static ServiceFactory instance = new ServiceFactory();
    private final CandyService candyService = new CandyServiceImpl();

    private ServiceFactory() {
    }

    public CandyService getCandyService() {
        return candyService;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }
}
