package com.pprog.cledule.entities;

import jakarta.persistence.Entity;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Division extends  BaseEntity {

    private String name;

    private Set<Department> departments = new HashSet<>();

    public Division(){}

    public Division(String name){
        this.name  = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Department> getDepartments() {
        return departments;
    }
}
