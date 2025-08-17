package com.pprog.cledule.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "equipments")
@NoArgsConstructor
@Getter
@Setter
public class Equipment extends BaseEntity {

    private String name;

    @Setter(AccessLevel.NONE)
    private Set<Space> spaces =  new HashSet<>();

    public Equipment(String name) {
        this.name = name;
    }
}
