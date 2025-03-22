package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(
        name = "Response",
        description = "Schema to hold Successful Response Information"
)
public class ResponseDTO {

    @Schema(
            description = "Status code of the EazyBank Account", example = "200"
    )
    private String statusCode;

    @Schema(
            description = "Status message of the EazyBank Account", example = "Request Processed Successfully"
    )
    private String statusMsg;
}
