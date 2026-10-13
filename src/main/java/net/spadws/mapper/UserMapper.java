package net.spadws.mapper;

import net.spadws.model.JPA.User;
import net.spadws.model.UserDto;
import net.spadws.model.response.UserResponseDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserDto dto) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPasswordHash(dto.getPassword());
        user.setDescription(dto.getDescription());
        user.setBirthDate(dto.getBirthDate());
        return user;
    }

    public UserResponseDto toResponseDto(User user) {
        return new UserResponseDto(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getDescription(),
                user.getBirthDate(),
                user.getCreatedAt()
        );
    }

}
