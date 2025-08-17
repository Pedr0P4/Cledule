package com.pprog.cledule.entities;

import com.pprog.cledule.enums.ReservationStatus;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
public class Reservation extends BaseEntity {

    private String eventName;
    private LocalDateTime start;
    private LocalDateTime end;
    private ReservationStatus status;

    private User user;

    public Reservation() {}

    public Reservation(String eventName, LocalDateTime start, LocalDateTime end, ReservationStatus status, User user) {
        this.eventName = eventName;
        this.start = start;
        this.end = end;
        this.status = status;
        this.user = user;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
