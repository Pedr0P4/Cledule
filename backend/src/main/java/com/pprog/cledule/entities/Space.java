package com.pprog.cledule.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Space implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private int capacity;
    private int floor;

    private Department department;
    private Set<Equipment> equipments =  new HashSet<>();
    private Set<Reservation> reservations =  new HashSet<>();

    public Space() {}

    public Space(Long id, String name, int capacity, int floor, Department department) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.floor = floor;
        this.department = department;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Set<Equipment> getEquipments() {
        return equipments;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Space space = (Space) o;
        return Objects.equals(id, space.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
