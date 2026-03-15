package com.campushub.campus_hub.Service;

import com.campushub.campus_hub.DTO.StudentsClubDTO;
import com.campushub.campus_hub.Entity.StudentsClubEntity;

import java.util.List;

public interface StudentsClubService {
    void saveStudentsClub(StudentsClubDTO studentsClub);
    void updateStudentsClub(String Student_id, String Club_id);
    void deleteStudentsClub(StudentsClubDTO studentsClub);
    List<StudentsClubDTO> getStudentsClubs();
}
