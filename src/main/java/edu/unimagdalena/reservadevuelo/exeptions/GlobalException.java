package edu.unimagdalena.reservadevuelo.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalException{
    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<ErrorMessages> resourceNotFoundHandler(ResourceNotFoundException ex, WebRequest request) {
        ErrorMessages errorMessages = new ErrorMessages(HttpStatus.NOT_FOUND.value(),
                                                        ex.getMessage(),
                                                        LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessages);
    }
}
