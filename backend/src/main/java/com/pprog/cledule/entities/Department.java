package com.pprog.cledule.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Department implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    private Division division;
    private Set<Space> spaces =  new HashSet<>();

    public Department () {}

    public Department(Long id, String name, Division division) {
        this.id = id;
        this.name = name;
        this.division = division;
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

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Set<Space> getSpaces() {
        return spaces;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
