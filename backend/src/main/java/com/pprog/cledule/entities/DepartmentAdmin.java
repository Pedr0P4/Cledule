package com.pprog.cledule.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "department_admins")
@Getter
@NoArgsConstructor
public class DepartmentAdmin extends User {
    @OneToMany(mappedBy = "createdBy")
    private Set<Space> createdSpaces = new HashSet<>();
}
