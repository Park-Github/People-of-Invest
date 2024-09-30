package poe.spring.exception.global;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import poe.spring.common.Api;


@Slf4j
@Order
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Api<Void>> GlobalException(Exception e) {
        log.error(e.getMessage());
        return ResponseEntity
                .status(500)
                .body(Api.<Void>builder()
                        .statusCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()))
                        .resultMessage("An internal server error occurred.")
                        .build());
    }

}
