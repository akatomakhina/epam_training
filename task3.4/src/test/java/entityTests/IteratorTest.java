package entityTests;

import by.epamTrainings.task3dot4.entity.LinkedList;
import by.epamTrainings.task3dot4.entity.interfaces.Iterator;
import by.epamTrainings.task3dot4.entity.interfaces.List;
import org.junit.Assert;
import org.junit.Test;

public class IteratorTest {
    @Test
    public void hasNext() throws Exception {
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("aa");
        list.add("aaa");
        Iterator iterator = list.getIterator();
        Assert.assertTrue(iterator.hasNext());
    }

    @Test
    public void hasNextWithRemove() throws Exception {
        List<String> list = new LinkedList<>();
        list.add("a");
        list.remove("a");
        list.remove(0);
        Iterator iterator = list.getIterator();
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void hasNextWithRemoveEmptyList() throws Exception {
        List<String> list = new LinkedList<>();
        Iterator iterator = list.getIterator();
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void nextWithArraySize() throws Exception {
        String[] expected = {"a", "aa", "aaa", "aaaa"};
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("aa");
        list.add("aaa");
        list.add("aaaa");
        Iterator<String> iterator = list.getIterator();
        String[] actual = new String[list.size()];
        int i = 0;
        while (iterator.hasNext()) {
            actual[i++] = iterator.next();
        }
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void next() throws Exception {
        List<String> list = new LinkedList<>();
        list.add("sdg");
        Iterator iterator = list.getIterator();
        Assert.assertEquals("sdg", iterator.next());
    }
}
