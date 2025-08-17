package com.pprog.cledule.entities;

import com.pprog.cledule.enums.Role;
import com.pprog.cledule.models.EmailUtils;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends  BaseEntity {

    private String name;
    private String email;
    private Role role;

    private Set<Reservation> reservations = new HashSet<>();

    public User(){}

    public User(String name, Role role, String email) {
        this.name = name;
        this.role = role;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(EmailUtils.isValid(email)){
            this.email = email;
        }
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }
}
