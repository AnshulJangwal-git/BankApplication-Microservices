package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account Information"
)
public class AccountsDTO {

    @Schema(
            description = "Account number of the EazyBank Account", example = "1234567890"
    )
    @NotEmpty(message = "Account Number can not be empty")
    @Pattern(regexp = "[0-9]{10}", message = "Account Number must be exactly 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of the EazyBank Account", example = "Savings"
    )
    @NotEmpty(message = "Account type can not be empty")
    private String accountType;

    @Schema(
        description = "Branch Address of the EazyBank Account", example = "123 New york City"
    )
    @NotEmpty(message = "Branch Address can not be null or empty")
    private String branchAddress;

}
