package service;

import entity.Person;
import service.impl.PersonServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final PersonService personService = new PersonServiceImpl();
    private ServiceFactory() {}

    public PersonService getPersonService() {
        return personService;
    }
    public static ServiceFactory getInstance() {
        return instance;
    }
}
