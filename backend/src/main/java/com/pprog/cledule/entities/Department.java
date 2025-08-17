package com.pprog.cledule.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@Getter
@Setter
public class Department extends BaseEntity {

    private String name;

    private Division division;
    @Setter(AccessLevel.NONE)
    private Set<Space> spaces =  new HashSet<>();

    public Department(String name, Division division) {
        this.name = name;
        this.division = division;
    }
}
