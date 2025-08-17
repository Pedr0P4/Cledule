package com.pprog.cledule.entities;

import jakarta.persistence.Entity;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Equipment extends BaseEntity {

    private String name;

    private Set<Space> spaces =  new HashSet<>();

    public Equipment() {}

    public Equipment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Space> getSpaces() {
        return spaces;
    }
}
