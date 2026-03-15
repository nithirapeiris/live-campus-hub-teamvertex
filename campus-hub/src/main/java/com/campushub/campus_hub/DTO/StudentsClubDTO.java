package com.campushub.campus_hub.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentsClubDTO implements Serializable {
    private String Student_id;
    private String Club_id;
}
