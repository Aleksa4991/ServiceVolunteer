package ru.project.servicevolunteer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.servicevolunteer.models.MedCard;

public interface MedCardRepository extends JpaRepository <MedCard, Long> {
}
