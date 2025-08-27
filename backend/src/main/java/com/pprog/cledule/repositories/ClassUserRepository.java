package com.pprog.cledule.repositories;

import com.pprog.cledule.entities.SpaceUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassUserRepository extends JpaRepository<SpaceUser, Long> {
}
