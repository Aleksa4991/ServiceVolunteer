package ru.project.servicevolunteer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.servicevolunteer.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
