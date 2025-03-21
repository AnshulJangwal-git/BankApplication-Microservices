package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDTO {

    @NotEmpty(message = "Account Number can not be empty")
    @Pattern(regexp = "[0-9]{10}", message = "Account Number must be exactly 10 digits")
    private Long accountNumber;

    @NotEmpty(message = "Account type can not be empty")
    private String accountType;

    @NotEmpty(message = "Branch Address can not be null or empty")
    private String branchAddress;

}
