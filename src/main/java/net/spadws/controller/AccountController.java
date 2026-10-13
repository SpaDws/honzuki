package net.spadws.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import net.spadws.model.UserDto;
import net.spadws.model.response.UserResponseDto;
import org.springframework.http.ResponseEntity;

/**
 * The interface Account Controller
 */
@Tag(name = "AccountContoller", description = "Account services")
public interface AccountController {
    /**
     * Register new user.
     *
     * @param dto the user dto
     * @return the creation of a new user
     */
    @Operation(summary = "Register new user",
            description = "Create a new user account",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Datos del nuevo usuario",
                    required = true,
                    content = @Content(schema = @Schema(implementation = UserDto.class))
            )
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Register success"),
            @ApiResponse(responseCode = "400", description = "Existent or invalid data"),
            @ApiResponse(responseCode = "500", description = "Internal error")
    })
    ResponseEntity<UserResponseDto> registerUser(@RequestBody UserDto dto);
}
