package entityTests;

import by.epamTrainings.task3dot4.entity.LinkedList;
import by.epamTrainings.task3dot4.entity.interfaces.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    private List linkedList = new LinkedList();

    @Before
    public void fill() {
        linkedList.addValues(new Object[]{53f, "kkk", 124.5});
    }

    @Test
    public void get() throws Exception {
        Object second = linkedList.get(1);
        Assert.assertEquals("kkk",second);
    }

    @Test
    public void set() throws Exception {
        linkedList.set(1, "124.5");
        Assert.assertEquals("124.5", linkedList.get(1), "124.5");
    }

    @Test
    public void add() throws Exception {
        linkedList.add(6);
        Assert.assertEquals(6,linkedList.get(3));
    }

    @Test
    public void addValues() throws Exception {
        linkedList.addValues(new Object[]{124.5, 12f, "mmm"});
        Assert.assertEquals(124.5,linkedList.get(3));
        Assert.assertEquals(12f,linkedList.get(4));
        Assert.assertEquals("mmm",linkedList.get(5));
    }

    @Test
    public void remove() throws Exception {
        linkedList.remove(1);
        Assert.assertEquals("kkk",linkedList.get(1));
    }

    @Test
    public void removeObject() throws Exception {
        linkedList.remove("kkk");
        Assert.assertEquals(124.5,linkedList.get(1));
    }
}
