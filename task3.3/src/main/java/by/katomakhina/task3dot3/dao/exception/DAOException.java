package by.katomakhina.task3dot3.dao.exception;

public class DAOException extends Exception {
    private static final long serialVersionUID = -5572124874938663294L;

    public DAOException() {
    }

    public DAOException(String message) {
        super(message);
    }

    public DAOException(String message, Exception e) {
        super(message, e);
    }

    public DAOException(Exception e) {
        super(e);
    }
}
