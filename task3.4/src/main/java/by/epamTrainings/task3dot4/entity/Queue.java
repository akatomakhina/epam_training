package by.epamTrainings.task3dot4.entity;

public interface Queue<E> {
    void addFirst(E object);
    void addLast(E object);
    E removeFirst();
    E removeLast();

    boolean offerFirst(E object);
    boolean offerLast(E object);
}
