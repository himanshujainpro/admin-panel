package io.adminpanel.exception;

public class DataNotExistException extends RuntimeException {
    public DataNotExistException(String message) {
        super(message);
    }
}
