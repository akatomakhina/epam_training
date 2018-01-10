package by.katomakhina.dao.parse.help.transformator;

import by.katomakhina.task3dot3.dao.parse.help.util.Transformator;
import org.junit.Assert;
import org.junit.Test;

public class TransformatorTest {
    @Test
    public void getEnumFromString() throws Exception {
        String expected = "GROWING_TIPS";
        String actual = Transformator.getEnumFromString(" growing-tips   ");
        Assert.assertEquals(expected, actual);
    }

}
