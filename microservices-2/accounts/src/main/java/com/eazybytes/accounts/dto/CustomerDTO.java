package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CustomerDTO {

    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 3, max = 30, message = "The length of the customer name must be between 5 and 30")
    private String name;

    @NotEmpty(message = "Email can not be null or empty")
    @Email(message = "Email address must be valid value")
    private String email;

    @Pattern(regexp = "[0-9]{10}", message = "Mobile Number must be exactly 10 digits")
    private String mobileNumber;

    private AccountsDTO accountsDTO;

}
