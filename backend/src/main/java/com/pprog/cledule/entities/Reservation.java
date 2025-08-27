package com.pprog.cledule.entities;

import com.pprog.cledule.enums.ReservationStatus;
import jakarta.persistence.*;
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
    private LocalDateTime eventStart;
    private LocalDateTime eventEnd;
    private ReservationStatus status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private SpaceUser spaceUser;
    @ManyToOne
    @JoinColumn(name = "space_id")
    private Space space;

    public Reservation(String eventName, LocalDateTime eventStart, LocalDateTime eventEnd, ReservationStatus status, SpaceUser spaceUser, Space space) {
        this.eventName = eventName;
        this.eventStart = eventStart;
        this.eventEnd = eventEnd;
        this.status = status;
        this.spaceUser = spaceUser;
        this.space = space;
    }
}
