package com.pprog.cledule.entities;

import jakarta.persistence.*;
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

    @ManyToOne(optional = false)
    @JoinColumn(name = "division_id")
    private Division division;

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Space> spaces =  new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User createdBy;

    public Department(String name, Division division) {
        this.name = name;
        this.division = division;
    }
}
