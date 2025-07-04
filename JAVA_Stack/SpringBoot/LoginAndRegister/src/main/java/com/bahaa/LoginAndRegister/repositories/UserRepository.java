package com.bahaa.LoginAndRegister.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bahaa.LoginAndRegister.models.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUserName(String userName);
	Optional<User> findByEmail(String email);
}