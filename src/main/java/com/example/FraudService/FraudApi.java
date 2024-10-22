package com.example.FraudService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
public interface FraudApi {
    @Tag( name = "Frauds", description = "Obtain the info for fraud service")
    @Operation(
            summary = "List of black cards",
            description = "The all cards"
    )
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200", description = "Successful"
                    ),
                    @ApiResponse(
                            responseCode = "500",
                            description = "${api.responseCodes.internalServer.description}",
                            content = {
                                    @Content(mediaType = "application/json",
                                            schema = @Schema(implementation = ErrorResponse.class))
                            }
                    ),
            }
    )
    ResponseEntity<List<ResponseDto>> index();

    @Tag(name="creditBlackIn", description = "Is the credit card in blacklist?")
    ResponseEntity<ResponseDto> creditBlack(RequestDto requestDto);
}

