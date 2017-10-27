package by.tc.task2.service;

import by.tc.task2.service.impl.XMLServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final XMLService xmlService = new XMLServiceImpl();
    private ServiceFactory() {}

    public XMLService getXMLService() {
        return xmlService;
    }
    public static ServiceFactory getInstance() {
        return instance;
    }
}
