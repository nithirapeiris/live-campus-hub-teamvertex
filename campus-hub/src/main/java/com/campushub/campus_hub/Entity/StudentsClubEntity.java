package com.campushub.campus_hub.Entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "students_clubs")
public class StudentsClubEntity {
    @EmbeddedId
    private String Student_id;
    private String Club_id;

}
