package ru.project.servicevolunteer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.project.servicevolunteer.models.MedicalPetCard;

@Repository
public interface MedicalPetCardRepository extends JpaRepository <MedicalPetCard,Long> {
}
