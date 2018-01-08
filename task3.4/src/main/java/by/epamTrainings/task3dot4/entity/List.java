package by.epamTrainings.task3dot4.entity;

import by.epamTrainings.task3dot4.entity.Iterator;

public interface List<E> {
    public void addValues(E[] objects);

    public void add(E object);

    public E get(int index);

    public void set(int index, E object);

    public void remove(int index);

    boolean remove(E object);

    public int size();

    public boolean isEmpty();

    public int indexOf(E object);

    public E[] toArray(E[] array);

    public Iterator getIterator();
}
