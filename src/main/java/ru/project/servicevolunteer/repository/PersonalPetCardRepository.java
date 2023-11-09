package ru.project.servicevolunteer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.project.servicevolunteer.models.PersonalPetCard;

@Repository
public interface PersonalPetCardRepository extends JpaRepository <PersonalPetCard,Long>{}

