package com.campushub.campus_hub.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

@Table(name = "events")
public class EventEntity {
    @Id
    private String event_id;
    private String event_title;
    private LocalDateTime event_date;
    private String location_id;
    private String club_id;
}
