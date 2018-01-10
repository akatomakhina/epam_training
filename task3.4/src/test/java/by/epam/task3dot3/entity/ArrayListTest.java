package by.epam.task3dot3.entity;

import by.epamTrainings.task3dot4.entity.Iterator;
import by.epamTrainings.task3dot4.entity.impl.ArrayList;
import by.epamTrainings.task3dot4.entity.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {
    private List arrayList = new ArrayList();
    private Object[] object = new Object[]{123, "yyy"};

    @Before
    public void fill() {
        arrayList.addValues(object);
    }

    @Test
    public void addValues() throws Exception {
        Object[] expected = new Object[]{123, "yyy", 124.5, 12f, "mmm"};

        arrayList.addValues(new Object[]{124.5, 12f, "mmm"});
        Object[] actual = new Object[arrayList.size()];
        actual = arrayList.toArray(actual);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void add() throws Exception {
        Object[] expected = new Object[]{123, "yyy", 6, 7, "nnn"};

        arrayList.add(6);
        arrayList.add(7);
        arrayList.add("nnn");

        Object[] actual = new Object[arrayList.size()];
        actual = arrayList.toArray(actual);

        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void remove() throws Exception {
        arrayList.remove(0);
        Assert.assertEquals("yyy",arrayList.get(0));
    }

    @Test
    public void removeObject() throws Exception {
        arrayList.remove(123);
        Assert.assertEquals(123,arrayList.get(0));
    }

    @Test
    public void get() throws Exception {
        Object element = arrayList.get(1);
        Assert.assertEquals("yyy",element);
    }

    @Test
    public void set() throws Exception {
        arrayList.set(1, "kkk");
        Assert.assertEquals("kkk", arrayList.get(1), "kkk");
    }

    @Test
    public void size() throws Exception {
        Iterator iterator = arrayList.getIterator();
        int counter = 0;
        while(iterator.hasNext()){
            iterator.next();
            counter++;
        }
        Assert.assertEquals(arrayList.size(),counter);
    }

    @Test
    public void isEmpty() throws Exception {
        List list = new ArrayList();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void indexOf() throws Exception {
        int index = arrayList.indexOf("yyy");
        Assert.assertEquals(index, object[1]);
    }
}
