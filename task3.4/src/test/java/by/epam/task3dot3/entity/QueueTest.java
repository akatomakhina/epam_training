package by.epam.task3dot3.entity;

import by.epamTrainings.task3dot4.entity.impl.LinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {
    private LinkedList list = new LinkedList();
    private Object[] object = new Object[]{123, "yyy", 5, 11.4};

    @Before
    public void fill() {
        list.addValues(object);
    }

    @Test
    public void addFirst() throws Exception {
        Object[] expected = new Object[]{3, 123, "yyy", 5, 11.4};
        list.addFirst(3);
        Object[] actual = new Object[list.size()];
        actual = list.toArray(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addLast() throws Exception {
        Object[] expected = new Object[]{123, "yyy", 5, 11.4, 3};
        list.addLast(3);
        Object[] actual = new Object[list.size()];
        actual = list.toArray(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeFirst() throws Exception {
        Object[] expected = new Object[]{"yyy", 5, 11.4};
        list.removeFirst();
        Object[] actual = new Object[list.size()];
        actual = list.toArray(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeLast() throws Exception {
        Object[] expected = new Object[]{123, "yyy", 5};
        list.removeLast();
        Object[] actual = new Object[list.size()];
        actual = list.toArray(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void offerFirst() throws Exception {
        Object[] expected = new Object[]{3, 123, "yyy", 5, 11.4};
        list.offerFirst(3);
        Object[] actual = new Object[list.size()];
        actual = list.toArray(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void offerLast() throws Exception {
        Object[] expected = new Object[]{123, "yyy", 5, 11.4, 3};
        list.offerLast(3);
        Object[] actual = new Object[list.size()];
        actual = list.toArray(actual);
        Assert.assertArrayEquals(expected, actual);
    }
}
