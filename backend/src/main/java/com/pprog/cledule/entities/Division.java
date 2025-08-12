package com.pprog.cledule.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public class Division implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Set<Department> departments;

    public Division(){}

    public Division(Long id, String name){
        this.id = id;
        this.name  = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Division division = (Division) o;
        return Objects.equals(id, division.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
