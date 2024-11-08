package edu.unimagdalena.reservadevuelo.exeptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ErrorMessages {
    private int status;
    private String message;
    private LocalDateTime timestamp;
}
