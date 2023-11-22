package ru.project.servicevolunteer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.servicevolunteer.models.MedCard;

import java.util.Optional;

public interface MedCardRepository extends JpaRepository <MedCard, Long> {
}
