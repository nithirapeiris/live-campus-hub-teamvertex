package com.campushub.campus_hub.Entity;

import com.campushub.campus_hub.Enums.BusStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

@Table(name = "bus")
public class BusEntity {
    @Id
    private String bus_id;
    private String bus_number;
    @Enumerated(EnumType.STRING)
    private BusStatus status;
    private String departure;
    private String arrival;
    private LocalDateTime departure_time;
    private LocalDateTime arrival_time;
}
