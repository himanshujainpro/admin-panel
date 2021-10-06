package io.adminpanel.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import javax.validation.ConstraintViolationException;

@ControllerAdvice
public class AdminPanelErrorHandler {

    private static final Logger logger = LoggerFactory.getLogger(AdminPanelErrorHandler.class);

//    @ExceptionHandler({ConstraintViolationException.class})
//    public ResponseEntity<String> handleConstraintViolation(
//            ConstraintViolationException exception, WebRequest request) {
//        logger.error(exception.getMessage());
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
//    }


    @ExceptionHandler({Exception.class})
    public ResponseEntity<String> handleAllExceptions(Exception e) {
        logger.error(e.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }


}
