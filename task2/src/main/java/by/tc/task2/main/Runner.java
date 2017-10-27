package by.tc.task2.main;

import by.tc.task2.entity.Entity;
import by.tc.task2.service.ServiceFactory;
import by.tc.task2.service.XMLService;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        XMLService parserService;
        try {
            parserService = serviceFactory.getXMLService();
            Entity entity = parserService.parseXML();
            entity.print(System.out,"");
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
