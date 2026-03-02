package com.campushub.campus_hub.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

@Table(name = "student")
public class StudentEntity {
    @Id
    private String student_id;
    private String student_pwd;
    private String first_name;
    private String last_name;
    private int phone;
    private String email;
    private Timestamp enrolled_Year;
    private String department_id;
}
