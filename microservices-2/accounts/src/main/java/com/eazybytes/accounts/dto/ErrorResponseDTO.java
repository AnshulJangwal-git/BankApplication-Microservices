package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Schema(
        name = "Error Response",
        description = "Schema to hold Successful Error Response Information"
)
public class ErrorResponseDTO {

    @Schema(
            description = "API Path invoked by the Client"
    )
    private String apiPath;
    @Schema(
            description = "Error Code representing the error happened"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error Message representing the error happened"
    )
    private String errorMessage;

    @Schema(
        description = "Time when the error happened"
    )
    private LocalDateTime errorTime;
}
