package mx.unam.aragon.ico.is.formula1.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalErrorManager {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    private ResponseEntity<String>
            handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        return ResponseEntity.ok("No es valido");
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String>
    handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {
        return ResponseEntity.accepted().body("Cierre las llaves");
    }

}
