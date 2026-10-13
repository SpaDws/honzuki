package net.spadws.controller.impl;

import lombok.AllArgsConstructor;
import net.spadws.controller.AccountController;
import net.spadws.model.UserDto;
import net.spadws.model.response.UserResponseDto;
import net.spadws.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Account Controller Implementation
 */
@RestController
@RequestMapping("/api/account")
@AllArgsConstructor
public class AccountControllerImpl implements AccountController {

    /**
     * The Account service
     */
    private final AccountService accountService;

    /**
     * Register new user
     *
     * @param dto the user dto
     * @return the creation of the user
     */
    @Override
    @PostMapping("/register")
    public ResponseEntity<UserResponseDto> registerUser(@RequestBody UserDto dto) {
        try {
            UserResponseDto userResponse = accountService.registerUser(dto);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(userResponse);
        } catch (RuntimeException e) {
            throw e;
        }
    }
}
