package com.onlycats.onlycats.back.service;

import com.onlycats.onlycats.back.domain.Users;
import com.onlycats.onlycats.back.domain.UserDto;
import com.onlycats.onlycats.back.mapper.UserMapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class NewAccountService {

    private DBService dbService;
    private UserMapper userMapper;

    public boolean comparePasswords (String password, String repeatPassword){
        return password.equals(repeatPassword);
    }

    public Users createNewUser  (UserDto userDto){
            System.out.println("New user created: " + userDto.getUsername());
        return dbService.saveUser(userMapper.mapUserDtoToUser(userDto));
        }
    }


}
