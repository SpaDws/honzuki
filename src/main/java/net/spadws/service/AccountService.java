package net.spadws.service;

import net.spadws.model.UserDto;
import net.spadws.model.response.UserResponseDto;

/**
 * The interface Account Service
 */
public interface AccountService {
    /**
     * Register a new user
     *
     * @param dto the user dto
     * @return the creation of the user
     */
    UserResponseDto registerUser(UserDto dto);
}
