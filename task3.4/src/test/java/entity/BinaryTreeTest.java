package entity;

import by.epamTrainings.task3dot4.entity.impl.BinaryTree;
import by.epamTrainings.task3dot4.entity.Tree;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTest {
    Tree<Integer> tree = new BinaryTree<>();

    @Before
    public void init() {
        tree.add(58);
        tree.add(34);
        tree.add(7);
        tree.add(16);
        tree.add(93);
        tree.add(42);
        tree.add(9);
        tree.add(101);
        tree.add(20);
        tree.add(72);
        tree.add(27);
        tree.add(87);
        tree.add(61);
    }

    @After
    public void destroy() {
        tree = null;
    }

    @Test
    public void add() throws Exception {
        List<String> expected = new ArrayList<>();
        expected.add("i");
        expected.add("e");
        expected.add("a");
        expected.add("f");
        expected.add("p");
        expected.add("n");
        expected.add("k");
        expected.add("y");

        BinaryTree<String> tree = new BinaryTree<>();
        tree.add("i");
        tree.add("e");
        tree.add("a");
        tree.add("f");
        tree.add("p");
        tree.add("n");
        tree.add("y");
        tree.add("k");
        List<String> actual = tree.preOrder();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() throws Exception {
        List<Integer> expected = new ArrayList<>();
        expected.add(61);
        expected.add(34);
        expected.add(7);
        expected.add(20);
        expected.add(9);
        expected.add(101);
        expected.add(87);

        tree.remove(58);
        tree.remove(42);
        tree.remove(16);
        tree.remove(27);
        tree.remove(93);
        tree.remove(72);

        List<Integer> actual = tree.preOrder();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void search() throws Exception {
        Assert.assertTrue(tree.search(93));
    }

    @Test
    public void searchFalse() throws Exception {
        Assert.assertFalse(tree.search(32));
    }

    @Test
    public void preOrder() throws Exception {
        Assert.assertArrayEquals(new Object[]{58, 34, 7, 16, 9, 20, 27, 42, 93, 72, 61, 87, 101}, tree.preOrder().toArray());
    }

    @Test
    public void inOrder() throws Exception {
        Assert.assertArrayEquals(new Object[]{7, 9, 16, 20, 27, 34, 42, 58, 61, 72, 87, 93, 101}, tree.inOrder().toArray());
    }

    @Test
    public void postOrder() throws Exception {
        Assert.assertArrayEquals(new Object[]{9, 27, 20, 16, 7, 42, 34, 61, 87, 72, 101, 93, 58}, tree.postOrder().toArray());
    }

    @Test
    public void equals() throws Exception {
        Tree<Integer> testTree = new BinaryTree<>();
        testTree.add(58);
        testTree.add(34);
        testTree.add(7);
        testTree.add(16);
        testTree.add(93);
        testTree.add(42);
        testTree.add(9);
        testTree.add(101);
        testTree.add(20);
        testTree.add(72);
        testTree.add(27);
        testTree.add(87);
        testTree.add(61);

        Assert.assertTrue(tree.equals(testTree));
    }

}
