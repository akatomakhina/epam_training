package entityTests;

import by.epamTrainings.task3dot4.entity.interfaces.Iterator;
import by.epamTrainings.task3dot4.entity.interfaces.List;
import by.epamTrainings.task3dot4.entity.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedIteratorTest {
    @Test
    public void hasNext() throws Exception {
        LinkedList list = new LinkedList();
        list.addFirst(3);
        list.addLast(4);
        list.add(5);
        Iterator iterator = list.getIterator();
        Assert.assertTrue(iterator.hasNext());
    }

    @Test
    public void hasNextWithEmptyList() throws Exception {
        List list = new LinkedList();
        Iterator iterator = list.getIterator();
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void nextWithIterator() throws Exception {
        Object[] expected = {3, 4, 5, null};

        LinkedList list = new LinkedList();
        list.addFirst(3);
        list.addLast(4);
        list.add(5);
        list.add(null);

        Object[] actual = new Object[list.size()];
        Iterator iterator = list.getIterator();

        int i = 0;
        while (iterator.hasNext()) {
            actual[i++] = iterator.next();
        }
        Assert.assertArrayEquals(expected, actual);
    }
}
