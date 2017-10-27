package by.tc.task2.dao;

import by.tc.task2.entity.Entity;

import java.io.FileNotFoundException;

public interface XMLDAO {
    Entity parseXML() throws FileNotFoundException;
}
