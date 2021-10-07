package io.adminpanel.handler;

import io.adminpanel.exception.DataNotExistException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AdminPanelErrorHandler {

    private static final Logger logger = LoggerFactory.getLogger(AdminPanelErrorHandler.class);

//    @ExceptionHandler({ConstraintViolationException.class})
//    public ResponseEntity<String> handleConstraintViolation(
//            ConstraintViolationException exception, WebRequest request) {
//        logger.error(exception.getMessage());
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
//    }


    @ExceptionHandler(DataNotExistException.class)
    public ResponseEntity<String> handleDataNotExistException(Exception e) {
        logger.error(e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<String> handleAllExceptions(Exception e) {
        logger.error(e.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }


}
