package com.pprog.cledule.entities;

import com.pprog.cledule.enums.Role;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User extends  BaseEntity {

    private String name;
    private String email;
    private Role role;

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Reservation> reservations = new HashSet<>();

    public User(String name, Role role, String email) {
        this.name = name;
        this.role = role;
        this.email = email;
    }
}
