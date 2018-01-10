package by.katomakhina.task3dot3.service.exception;

public class ServiceException extends Exception {
    private static final long serialVersionUID = 5217602107575191266L;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Exception e) {
        super(message, e);
    }

    public ServiceException(Exception e) {
        super(e);
    }
}
