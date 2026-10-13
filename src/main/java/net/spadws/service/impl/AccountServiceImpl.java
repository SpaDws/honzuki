package net.spadws.service.impl;

import lombok.AllArgsConstructor;
import net.spadws.mapper.UserMapper;
import net.spadws.model.JPA.User;
import net.spadws.model.UserDto;
import net.spadws.model.response.UserResponseDto;
import net.spadws.repository.UserRepository;
import net.spadws.service.AccountService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public UserResponseDto registerUser(UserDto dto) {
        if (repository.existsByUsername(dto.getUsername())) {
            throw new RuntimeException("Username already in use");
        }
        if (repository.existsByEmail(dto.getEmail())) {
            throw new RuntimeException("Email already in use");
        }

        User user = mapper.toEntity(dto);
        user.setCreatedAt(LocalDateTime.now());
        User savedUser = repository.save(user);

        return mapper.toResponseDto(savedUser);
    }
}
