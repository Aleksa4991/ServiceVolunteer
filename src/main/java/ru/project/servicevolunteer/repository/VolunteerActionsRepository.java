package ru.project.servicevolunteer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.project.servicevolunteer.entity.VolunteerActions;

@Repository
public interface VolunteerActionsRepository extends JpaRepository <VolunteerActions,Long> {
}