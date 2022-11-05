package com.onlycats.onlycats.back.repository;

import com.onlycats.onlycats.back.domain.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {

    @Override
    List<Users> findAll();

    @Override
    Users save(Users users);

    @Override
    Optional<Users> findById (Long id);

    @Override
    void deleteById (Long id);

    void deleteByUsername (String username);
}
