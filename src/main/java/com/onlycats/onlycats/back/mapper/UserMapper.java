package com.onlycats.onlycats.back.mapper;

import com.onlycats.onlycats.back.domain.Users;
import com.onlycats.onlycats.back.domain.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public Users mapUserDtoToUser (UserDto userDto){

        return new Users(0L, userDto.getName(), userDto.getSurname(), userDto.getEmail(), userDto.getUsername(), userDto.getPassword());
    }
}
