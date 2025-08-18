package com.pprog.cledule.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "divisions")
@NoArgsConstructor
@Getter
@Setter
public class Division extends  BaseEntity {

    private String name;

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Department> departments = new HashSet<>();

    public Division(String name){
        this.name  = name;
    }
}
