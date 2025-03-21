package com.eazybytes.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponseDTO {
    private String apiPath;
    private HttpStatus errorCode;
    private String errorMessage;
    private LocalDateTime errorTime;

//    public ErrorResponseDTO(String apiPath, HttpStatus errorCode, String errorMessage,
//                            LocalDateTime errorTime) {
//        this.apiPath = apiPath;
//        this.errorCode = errorCode;
//        this.errorMessage = errorMessage;
//        this.errorTime = errorTime;
//    }
}
