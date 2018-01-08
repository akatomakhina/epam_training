package by.epamTrainings.task3dot4.entity;

import java.util.List;

public interface Tree<E extends Comparable> {
    boolean add(E elem);

    boolean remove(E elem);

    boolean search(E elem);

    List<E> preOrder();

    List<E> inOrder();

    List<E> postOrder();
}