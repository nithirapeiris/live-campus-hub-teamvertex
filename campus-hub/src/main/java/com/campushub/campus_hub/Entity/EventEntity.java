package com.campushub.campus_hub.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

@Table(name = "events")
public class EventEntity {
    @Id
    private String event_id;
    private String event_title;
    private LocalDate event_date;
    private LocalTime event_time;
    private String location_id;
    private String club_id;
}
