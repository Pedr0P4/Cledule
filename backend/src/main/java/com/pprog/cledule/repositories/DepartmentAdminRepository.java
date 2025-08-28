package com.pprog.cledule.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pprog.cledule.entities.DepartmentAdmin;

public interface DepartmentAdminRepository extends JpaRepository<DepartmentAdmin, Long> {
    
}
