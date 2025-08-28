package com.pprog.cledule.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "department_admins")
@Getter
@NoArgsConstructor
public class DepartmentAdmin extends User {
    @OneToMany(mappedBy = "createdBy")
    private Set<Reservation> createdReservations = new HashSet<>();

    @OneToMany(mappedBy = "createdBy")
    private Set<Space> createdSpaces = new HashSet<>();

    public DepartmentAdmin(String userName, String userEmail, String userPassword){
        super(userName, userEmail, userPassword);
    }
}
