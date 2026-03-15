package com.campushub.campus_hub.Dao;

import com.campushub.campus_hub.Entity.StudentsClubEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentsClubDao extends JpaRepository<StudentsClubEntity,String> {
    Optional<StudentsClubEntity> findByStudentIdAndClubId(String studentId, String clubId);
}
