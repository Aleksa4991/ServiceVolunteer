package ru.project.servicevolunteer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.servicevolunteer.models.VolunteerAction;

public interface VolunteerActionRepository extends JpaRepository<VolunteerAction, Long> {
}