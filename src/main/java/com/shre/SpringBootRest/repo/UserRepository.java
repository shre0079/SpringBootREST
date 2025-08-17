package com.shre.SpringBootRest.repo;

import com.shre.SpringBootRest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
