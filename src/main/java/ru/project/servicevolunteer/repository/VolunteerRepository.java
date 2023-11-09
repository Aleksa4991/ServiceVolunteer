package ru.project.servicevolunteer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.project.servicevolunteer.models.Volunteer;

@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer,Long> {
    Volunteer findByEmail(String email);
        }
