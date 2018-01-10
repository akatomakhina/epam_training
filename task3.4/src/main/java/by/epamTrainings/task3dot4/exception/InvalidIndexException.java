package by.epamTrainings.task3dot4.exception;

public class InvalidIndexException extends RuntimeException {
    private static final long serialVersionUID = -4431120445120240333L;

    public InvalidIndexException() {
    }

    public InvalidIndexException(String message) {
        super(message);
    }

    public InvalidIndexException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIndexException(Throwable cause) {
        super(cause);
    }
}