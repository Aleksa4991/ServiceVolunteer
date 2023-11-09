package ru.project.servicevolunteer.repository;

import org.springframework.context.annotation.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.project.servicevolunteer.models.Volunteer;

@Repository
public interface RoleRepository extends JpaRepository<Volunteer,Long> {
    Role findByName(String name);
}