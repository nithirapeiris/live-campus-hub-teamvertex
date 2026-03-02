package com.campushub.campus_hub.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentRewardDTO {
    private String student_id;
    private String reward_id;
    private LocalDateTime earned_date;
    private int points;
}
