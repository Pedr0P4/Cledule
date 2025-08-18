package com.pprog.cledule.repositories;

import com.pprog.cledule.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
