package by.epamTrainings.task3dot4.entity.interfaces;

public interface Iterator<E> {
    E next();
    boolean hasNext();
    void remove();
}
