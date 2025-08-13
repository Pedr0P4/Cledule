package com.pprog.cledule.entities;

import com.pprog.cledule.enums.ReservationStatus;
import com.pprog.cledule.models.EmailType;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Reservation implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String eventName;
    private LocalDateTime start;
    private LocalDateTime end;
    private ReservationStatus status;

    private User user;

    public Reservation() {}

    public Reservation(Long id, String eventName, LocalDateTime start, LocalDateTime end, ReservationStatus status, User user) {
        this.id = id;
        this.eventName = eventName;
        this.start = start;
        this.end = end;
        this.status = status;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
