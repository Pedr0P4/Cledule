package com.pprog.cledule.entities;

import jakarta.persistence.*;
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

    @ManyToOne(optional = false)
    @JoinColumn(name = "department_id")
    private Department department;

    @Setter(AccessLevel.NONE)
    @ManyToMany
    @JoinTable(name = "tb_space_equipment", joinColumns = @JoinColumn(name = "space_id"), inverseJoinColumns = @JoinColumn(name = "equipment_id"))
    private Set<Equipment> equipments =  new HashSet<>();

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "space")
    private Set<Reservation> reservations =  new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User createdBy;

    public Space(String name, int capacity, int floor, Department department) {
        this.name = name;
        this.capacity = capacity;
        this.floor = floor;
        this.department = department;
    }
}
