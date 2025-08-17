package com.pprog.cledule.entities;

import jakarta.persistence.Entity;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Space extends BaseEntity {

    private String name;
    private int capacity;
    private int floor;

    private Department department;
    private Set<Equipment> equipments =  new HashSet<>();
    private Set<Reservation> reservations =  new HashSet<>();

    public Space() {}

    public Space(String name, int capacity, int floor, Department department) {
        this.name = name;
        this.capacity = capacity;
        this.floor = floor;
        this.department = department;
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
}
