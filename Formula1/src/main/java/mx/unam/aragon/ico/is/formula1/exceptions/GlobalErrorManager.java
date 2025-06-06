package mx.unam.aragon.ico.is.formula1.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

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
        return ResponseEntity.accepted().body("Revise su sintaxis");
    }

    @ExceptionHandler(HttpMediaTypeException.class)
    private ResponseEntity<HashMap<String,String>>
    handleException(HttpMediaTypeException ex) {
        HashMap<String,String> errors = new HashMap<>();
        errors.put("timestamp", LocalDateTime.now().toString());
        errors.put("mensaje", "Error al leer el mensaje");
        errors.put("error", "777");
        return new ResponseEntity<>(errors, HttpStatus.CREATED);
    }

}
