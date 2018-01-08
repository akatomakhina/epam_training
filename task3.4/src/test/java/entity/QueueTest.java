package entity;

import by.epamTrainings.task3dot4.entity.impl.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
    @Test
    public void addFirst() throws Exception {
        LinkedList list = new LinkedList();
        list.addFirst(3);
        list.add(5);
        list.add("nnn");
        list.add(8);
        Assert.assertEquals(3, list.get(0));
    }

    @Test
    public void addLast() throws Exception {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add("nnn");
        list.add(8);
        list.addLast(3);
        Assert.assertEquals(3, list.get(3));
    }

    @Test
    public void removeFirst() throws Exception {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add("nnn");
        list.add(8);
        list.removeFirst();
        Assert.assertEquals("nnn", list.get(0));
    }

    /*@Test
    public void removeLast() throws Exception {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add("nnn");
        list.add(8);
        list.removeLast();
        Object[] object = new Object[list.size()];
        object = list.toArray(object);
        Assert.assertNull(object[2]);
    }*/

    @Test
    public void offerFirst() throws Exception {
        LinkedList list = new LinkedList();
        list.offerFirst(3);
        list.add(5);
        list.add("nnn");
        list.add(8);
        Assert.assertEquals(3, list.get(0));
    }

    @Test
    public void offerLast() throws Exception {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add("nnn");
        list.add(8);
        list.offerLast(3);
        Assert.assertEquals(3, list.get(3));
    }
}
