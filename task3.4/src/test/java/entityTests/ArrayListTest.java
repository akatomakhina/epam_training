package entityTests;

import by.epamTrainings.task3dot4.entity.ArrayList;
import by.epamTrainings.task3dot4.entity.interfaces.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {
    private List arrayList = new ArrayList();

    @Before
    public void fill() {
        arrayList.addValues(new Object[]{123, "yyy"});
    }

    @Test
    public void add() throws Exception {
        arrayList.add("nnn");
        arrayList.add(6);
        Assert.assertEquals("nnn",arrayList.get(2));
        Assert.assertEquals(6,arrayList.get(3));
    }

    @Test
    public void addValues() throws Exception {
        arrayList.addValues(new Object[]{124.5, 12f, "mmm"});
        Assert.assertEquals(124.5,arrayList.get(2));
        Assert.assertEquals(12f,arrayList.get(3));
        Assert.assertEquals("mmm",arrayList.get(4));
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
}
