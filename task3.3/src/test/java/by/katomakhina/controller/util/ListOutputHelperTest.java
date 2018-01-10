package by.katomakhina.controller.util;

import by.katomakhina.task3dot3.controller.util.ListOutputHelper;
import org.junit.Assert;
import org.junit.Test;

public class ListOutputHelperTest {
    @Test
    public void indexFirstElementOnPage() throws Exception {
        int expected = 32;
        int actual = ListOutputHelper.indexFirstElementOnPage(9);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIndexLastElementOnPage() throws Exception {
        int expected = 8;
        int actual = ListOutputHelper.getIndexLastElementOnPage(10, 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberPages() throws Exception {
        int expected = 7;
        int actual = ListOutputHelper.getNumberPages(25);
        Assert.assertEquals(expected,actual);
    }
}
