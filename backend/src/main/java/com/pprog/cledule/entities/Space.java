package com.pprog.cledule.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "spaces")
@NoArgsConstructor
@Getter
@Setter
public class Space extends BaseEntity {

    private String name;
    private int capacity;
    private int floor;

    private Department department;
    @Setter(AccessLevel.NONE)
    private Set<Equipment> equipments =  new HashSet<>();
    @Setter(AccessLevel.NONE)
    private Set<Reservation> reservations =  new HashSet<>();

    public Space(String name, int capacity, int floor, Department department) {
        this.name = name;
        this.capacity = capacity;
        this.floor = floor;
        this.department = department;
    }
}
