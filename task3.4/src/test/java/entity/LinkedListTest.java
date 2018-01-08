package entity;

import by.epamTrainings.task3dot4.entity.Iterator;
import by.epamTrainings.task3dot4.entity.impl.LinkedList;
import by.epamTrainings.task3dot4.entity.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    private List linkedList = new LinkedList();
    private Object[] object = new Object[]{53f, "kkk", 124.5, 1};

    @Before
    public void fill() {
        linkedList.addValues(object);
    }


    @Test
    public void addValues() throws Exception {
        Object[] expected = new Object[]{53f, "kkk", 124.5, 1, 124.5, 12f, "mmm"};

        linkedList.addValues(new Object[]{124.5, 12f, "mmm"});
        Object[] actual = new Object[linkedList.size()];
        actual = linkedList.toArray(actual);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void add() throws Exception {
        Object[] expected = new Object[]{53f, "kkk", 124.5, 1, 6, 7, "nnn"};

        linkedList.add(6);
        linkedList.add(7);
        linkedList.add("nnn");

        Object[] actual = new Object[linkedList.size()];
        actual = linkedList.toArray(actual);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void get() throws Exception {
        Object second = linkedList.get(1);
        Assert.assertEquals("kkk", second);
    }

    @Test
    public void set() throws Exception {
        linkedList.set(1, "124.5");
        Assert.assertEquals("124.5", linkedList.get(1), "124.5");
    }

    @Test
    public void remove() throws Exception {
        linkedList.remove(1);
        Assert.assertEquals("kkk", linkedList.get(1));
    }

    @Test
    public void removeObject() throws Exception {
        linkedList.remove("kkk");
        Assert.assertEquals(124.5, linkedList.get(1));
    }

    @Test
    public void size() throws Exception {
        Iterator iterator = linkedList.getIterator();
        int counter = 0;
        while (iterator.hasNext()) {
            iterator.next();
            counter++;
        }
        Assert.assertEquals(linkedList.size(), counter);
    }

    @Test
    public void isEmpty() throws Exception {
        List list = new LinkedList();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void indexOf() throws Exception {
        int index = linkedList.indexOf("kkk");
        Assert.assertEquals(index, 1);
    }
}
