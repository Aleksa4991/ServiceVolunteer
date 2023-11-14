package ru.project.servicevolunteer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.servicevolunteer.models.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
