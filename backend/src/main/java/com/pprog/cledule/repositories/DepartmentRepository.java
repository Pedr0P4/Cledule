package com.pprog.cledule.repositories;

import com.pprog.cledule.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
