package com.example.email_sender_api.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
public class ErrorDTO {

    private Integer errorCode;
    private String errorMessage;
    private LocalDateTime dateTime = LocalDateTime.now();

    public ErrorDTO(Integer errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
