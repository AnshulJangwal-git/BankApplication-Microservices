package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account Information"
)
public class CustomerDTO {

    @Schema(
        description = "Name of the customer", example = "Anshul Jangwal"
    )
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 3, max = 30, message = "The length of the customer name must be between 5 and 30")
    private String name;

    @Schema(
            description = "Mobile Number of the customer", example = "anshuljangwal@gmail.com"
    )
    @NotEmpty(message = "Email can not be null or empty")
    @Email(message = "Email address must be valid value")
    private String email;

    @Schema(
            description = "Mobile Number of the customer", example = "9345434342"
    )
    @Pattern(regexp = "[0-9]{10}", message = "Mobile Number must be exactly 10 digits")
    private String mobileNumber;

    @Schema(
        description = "Account Details of the Customer"
    )
    private AccountsDTO accountsDTO;

}
