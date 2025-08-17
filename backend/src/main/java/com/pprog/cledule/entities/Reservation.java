package com.pprog.cledule.entities;

import com.pprog.cledule.enums.ReservationStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
@NoArgsConstructor
@Getter
@Setter
public class Reservation extends BaseEntity {

    private String eventName;
    private LocalDateTime start;
    private LocalDateTime end;
    private ReservationStatus status;
    private User user;

    public Reservation(String eventName, LocalDateTime start, LocalDateTime end, ReservationStatus status, User user) {
        this.eventName = eventName;
        this.start = start;
        this.end = end;
        this.status = status;
        this.user = user;
    }
}
