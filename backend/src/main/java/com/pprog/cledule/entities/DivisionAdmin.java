package com.pprog.cledule.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "division_admins")
@Getter
@NoArgsConstructor
public class DivisionAdmin extends User {
    @OneToMany(mappedBy = "createdBy")
    private Set<Reservation> createdReservations = new HashSet<>();

    @OneToMany(mappedBy = "createdBy")
    private Set<Space> createdSpaces = new HashSet<>();

    @OneToMany(mappedBy = "createdBy")
    private Set<Department> createdDepartments = new HashSet<>();

    public DivisionAdmin(String userName, String userEmail, String userPassword){
        super(userName, userEmail, userPassword);
    }
}
