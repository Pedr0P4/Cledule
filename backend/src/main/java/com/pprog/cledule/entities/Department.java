package com.pprog.cledule.entities;

import jakarta.persistence.Entity;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Department extends BaseEntity {

    private String name;

    private Division division;
    private Set<Space> spaces =  new HashSet<>();

    public Department () {}

    public Department(String name, Division division) {
        this.name = name;
        this.division = division;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Set<Space> getSpaces() {
        return spaces;
    }
}
