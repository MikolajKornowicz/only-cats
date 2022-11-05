package com.onlycats.onlycats.back.service;

import com.onlycats.onlycats.back.domain.Users;
import com.onlycats.onlycats.back.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DBService {

    private final UserRepository userRepository;


    public Users saveUser (Users users){
        return userRepository.save(users);
    }

}
