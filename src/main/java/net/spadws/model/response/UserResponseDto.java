package net.spadws.model.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Schema(description = "User data for API responses (excludes sensitive fields)")
public class UserResponseDto {

    @Schema(description = "User ID", example = "1")
    private Long id;

    @Schema(description = "Username", example = "SpaDws")
    private String username;

    @Schema(description = "User email", example = "SpaDws@gmail.com")
    private String email;

    @Schema(description = "Hello, my name is Spa and i love collecting manga")
    private String description;

    @Schema(description = "User's date of birth", example = "1990-01-01")
    private LocalDate birthDate;

    @Schema(description = "When the user was created", example = "2026-10-13T12:00:00")
    private LocalDateTime createdAt;
}
