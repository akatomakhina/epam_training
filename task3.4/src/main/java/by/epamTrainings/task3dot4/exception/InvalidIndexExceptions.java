package by.epamTrainings.task3dot4.exception;

public class InvalidIndexExceptions extends RuntimeException {
    public InvalidIndexExceptions() {
    }

    public InvalidIndexExceptions(String message) {
        super(message);
    }

    public InvalidIndexExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIndexExceptions(Throwable cause) {
        super(cause);
    }
}