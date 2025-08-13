package com.pprog.cledule.entities;

import com.pprog.cledule.models.EmailType;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private EmailType email;

    private Set<Reservation> reservations = new HashSet<>();

    public User(){}

    public User(Long id, String name, EmailType email) {
        this.id = id;
        this.email = email;
        this.name   = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EmailType getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(EmailType email) {
        this.email = email;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
