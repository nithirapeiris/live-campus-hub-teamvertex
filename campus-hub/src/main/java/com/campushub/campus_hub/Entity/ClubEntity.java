package com.campushub.campus_hub.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

@Table(name = "clubs")
public class ClubEntity {
    @Id
    private String club_id;
    private String club_Name;
    private Boolean status;
}
