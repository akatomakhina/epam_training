package by.katomakhina.dao.parse.impl;

import by.katomakhina.task3dot3.entity.Candy;
import by.katomakhina.task3dot3.service.ServiceFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StAXParserTest {
    private List<Candy> expected = new ArrayList<>();

    @Before
    public void init() {
        expected.add(new Candy("candy1", "wafer", "Alenka", "530", new Candy.Ingredients("86", "15", "10", "milk", "10"), new Candy.Value("96", "45", "7"), "Kommunarka"));
        expected.add(new Candy("candy2", "wafer", "Mishka", "485", new Candy.Ingredients("99", "45", "12", "milk", "10"), new Candy.Value("96", "52", "537"), "Kommunarka"));
    }

    @After
    public void destroy() {
        expected = null;
    }

    @Test
    public void execute() throws Exception {
        ServiceFactory instance = ServiceFactory.getInstance();
        List<Candy> allCandies = instance.getCandyService().parse("StAX");
        List<Candy> actual = allCandies.subList(0, 2);
        Assert.assertArrayEquals(expected.toArray(), actual.toArray());

    }
}
