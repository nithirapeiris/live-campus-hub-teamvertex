package com.campushub.campus_hub.DTO;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class RewardDTO {
    private String reward_id;
    private String reward_name;
}
