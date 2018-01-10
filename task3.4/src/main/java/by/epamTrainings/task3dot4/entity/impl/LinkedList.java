package by.epamTrainings.task3dot4.entity.impl;

import by.epamTrainings.task3dot4.entity.Iterator;
import by.epamTrainings.task3dot4.entity.List;
import by.epamTrainings.task3dot4.entity.Deque;
import by.epamTrainings.task3dot4.exception.InvalidIndexException;

import java.util.NoSuchElementException;
import java.util.Objects;

public class LinkedList<E> implements List<E>, Deque<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public LinkedList(E... args) {
        addValues(args);
    }

    public LinkedList() {
        last = new Node<>(null, null, null);
        first = new Node<>(null, null, last);
        last.setPrevious(first);
    }

    @Override
    public void addFirst(E object) {
        linkFirst(object);
    }

    @Override
    public void addLast(E object) {
        linkLast(object);
    }

    @Override
    public E removeFirst() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return unlinkFirst();
    }

    @Override
    public E removeLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return unlinkLast();
    }

    @Override
    public boolean offerFirst(E object) {
        addFirst(object);
        return true;
    }

    @Override
    public boolean offerLast(E object) {
        addLast(object);
        return true;
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
        addLast(object);
    }

    @Override
    public boolean remove(E object) {
        Node<E> n = first.getNext();
        for (int i = 0; i < size; i++) {
            if (n.getElement().equals(object)) {
                n.getPrevious().setNext(n.getNext());
                n.getNext().setPrevious(n.getPrevious());
                size--;
                return true;
            }
            n = n.getNext();
        }
        return false;
    }

    @Override
    public void remove(int index) {
        if(isValidIndex(index)) {
            remove((E) node(index));
        }
        else throw new InvalidIndexException("Index: " + index + ", Size: " + size);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E get(int index) {
        if(isValidIndex(index)) {
            Node<E> n = first.getNext();
            for (int i = 0; i <= size; i++) {
                if (i == index) {
                    return n.getElement();
                }
                n = n.getNext();
            }
        }
        else throw new InvalidIndexException("Index: " + index + ", Size: " + size);
        return null;
    }

    @Override
    public void set(int index, E object) {
            if (isValidIndex(index)) {
                Node<E> n = first.getNext();
                for (int i = 0; i <= size; i++) {
                    if (i == index) {
                        n.element = object;
                    }
                    n = n.getNext();
                }
            }
            else throw new InvalidIndexException("Index: " + index + ", Size: " + size);
        }

    @Override
    public int indexOf(E object) {
        int index = 0;
        for (Node node = first; node != null; node = node.next) {
            if (object.equals(node.next.element))
                return index;
            index++;
        }
        return -1;
    }

    @Override
    public E[] toArray(E[] array) {
        Node node = first.next;
        for (int i = 0; i < size; ++i) {
            array[i] = (E) node.element;
            node = node.next;
        }
        return array;
    }

    @Override
    public Iterator<E> getIterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<E> {
        private int index;
        private Node<E> n = first;
        private Node<E> lastReturned;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public E next() {
            if (hasNext()) {
                lastReturned = n = n.getNext();
                index++;
                return n.getElement();
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            unlink(lastReturned);
            index--;
        }
    }

    private Node<E> node(Integer index) {
        Node<E> n = first.getNext();
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n;
    }

    private class Node<E> {
        private E element;
        private Node<E> previous;
        private Node<E> next;

        public Node() {
        }

        public Node(E element, Node<E> previous, Node<E> next) {
            this.element = element;
            this.previous = previous;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrevious() {
            return previous;
        }

        public void setPrevious(Node<E> previous) {
            this.previous = previous;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private void linkFirst(E object) {
        Node<E> next = first;
        next.setElement(object);
        first = new Node<>(null, null, next);
        next.setPrevious(first);
        size++;
    }

    private void linkLast(E object) {
        Node<E> prev = last;
        prev.setElement(object);
        last = new Node<>(null, prev, null);
        prev.setNext(last);
        size++;
    }

    private E unlink(Node<E> t) {
        t.getPrevious().setNext(t.getNext());
        t.getNext().setPrevious(t.getPrevious());
        size--;
        return t.getElement();
    }

    private E unlinkFirst() {
        Node<E> del = first.getNext();
        first.setNext(del.getNext());
        size--;
        return del.getElement();
    }

    private E unlinkLast() {
        Node<E> del = last.getPrevious();
        last.setPrevious(del.getPrevious());
        size--;
        return del.getElement();
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index <= size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedList<?> that = (LinkedList<?>) o;
        return size == that.size &&
                Objects.equals(first, that.first) &&
                Objects.equals(last, that.last);
    }

    @Override
    public int hashCode() {

        return Objects.hash(first, last, size);
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "first=" + first +
                ", last=" + last +
                ", size=" + size +
                '}';
    }
}
