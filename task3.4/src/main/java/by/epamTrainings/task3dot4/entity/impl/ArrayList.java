package by.epamTrainings.task3dot4.entity.impl;

import by.epamTrainings.task3dot4.entity.List;
import by.epamTrainings.task3dot4.exception.InvalidIndexException;
import by.epamTrainings.task3dot4.entity.Iterator;

import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E> {
    private static final int DEFAULT_SIZE = 10;

    private E[] values;
    private int size = 0;

    public ArrayList() {
        this(DEFAULT_SIZE);
    }

    public ArrayList(int size) {
        values = (E[]) new Object[size];
    }

    public ArrayList(E... args) {
        this();
        addValues(args);
    }

    @Override
    public void addValues(E[] objects) {
        if (objects != null) {
            for (E value : objects) {
                add(value);
            }
        }
    }

    @Override
    public void add(E object) {
        ensureCapacity();
        values[size++] = object;
    }

    @Override
    public E get(int index) {
        if(isValidIndex(index)) {
            return values[index];
        }
        else throw new InvalidIndexException("Index: " + index + ", Size: " + size);
    }

    @Override
    public void set(int index, E object) {
        if (isValidIndex(index)) {
            values[index] = object;
        }
    }

    @Override
    public void remove(int index) {
        if (isValidIndex(index)) {
            int numberElements = size - index - 1;
            if (numberElements > 0) {
                System.arraycopy(values, index + 1, values, index, numberElements);
            } else {
                values = null;
            }
            --size;
        }
    }

    @Override
    public boolean remove(E object) {
        int index = indexOf(object);
        if (isValidIndex(index)) {
            remove(index);
            return true;
        }
        return false;
    }

    @Override
    public int indexOf(E object) {
        for (int i = 0; i < size; ++i) {
            if (object != null ? object.equals(values[i]) : values[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public E[] toArray(E[] array) {
        System.arraycopy(this.values, 0, array, 0, size);
        return array;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (size < values.length) {
            return;
        }
        resize();
    }

    private void resize() {
        E[] temp = (E[]) new Object[values.length * 2];
        System.arraycopy(values, 0, temp, 0, values.length);
        values = temp;
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index <= size;
    }


    @Override
    public Iterator getIterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator {
        int index;
        int lastReturned;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public E next() {
            if (this.hasNext()) {
                lastReturned = index;
                return values[index++];
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            int numberElements = size - lastReturned - 1;
            System.arraycopy(values, lastReturned + 1, values, lastReturned, numberElements);
            values[--size] = null;
            index--;
        }
    }
}
