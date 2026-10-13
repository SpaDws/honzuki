package net.spadws.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Schema(description = "New user register DTO")
@Getter
@Setter
@NoArgsConstructor
public class UserDto {

    @Schema(description = "User username",
            requiredMode = Schema.RequiredMode.REQUIRED,
            maxLength = 30)
    private String username;

    @Schema(description = "User email",
            requiredMode = Schema.RequiredMode.REQUIRED,
            maxLength = 255)
    private String email;

    @Schema(description = "User description or bio")
    private String description;

    @Schema(description = "User's date of birth")
    private LocalDate birthDate;

    @Schema(description = "User's password", requiredMode = Schema.RequiredMode.REQUIRED)
    private String password;

}
