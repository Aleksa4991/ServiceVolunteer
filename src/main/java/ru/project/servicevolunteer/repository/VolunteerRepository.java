package ru.project.servicevolunteer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.servicevolunteer.models.Volunteer;

public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
    Volunteer findByEmail(String email);
}
