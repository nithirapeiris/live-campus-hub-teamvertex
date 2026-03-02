package com.campushub.campus_hub.DTO;


import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data


public class StaffDTO {
    private String staff_id;
    private String staff_pwd;
    private String first_name;
    private String last_name;
    private String email;
}
