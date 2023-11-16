package ru.project.servicevolunteer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.project.servicevolunteer.models.MedCard;
import ru.project.servicevolunteer.models.Pet;
import ru.project.servicevolunteer.repository.MedCardRepository;
import ru.project.servicevolunteer.repository.PetRepository;
import ru.project.servicevolunteer.service.VolunteerActionService;

import java.util.Optional;

@Slf4j
@Controller
public class MedCardController {

    @Autowired
    private MedCardRepository medCardRepository;
    @Autowired
    private VolunteerActionService volunteerActionService;

    @GetMapping("/addPetForm")
    public ModelAndView addMedCard()	{
        ModelAndView mav = new ModelAndView("add-pet-form");
        MedCard medCard = new MedCard();
        mav.addObject("medCard", medCard);
        volunteerActionService.savelog("Volunteer add a medical card for a pet");
        return mav;
    }

    @PostMapping("/saveMedCard")
    public void saveMedCard(@ModelAttribute MedCard medCard)	{
        medCardRepository.save(medCard);
        volunteerActionService.savelog("Volunteer save a medical card for a pet");
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Long medCardId)	{
        ModelAndView mav = new ModelAndView("add-pet-form");
        Optional<MedCard> optionalMedCard = medCardRepository.findById(medCardId);
        MedCard medCard = new MedCard();
        if(optionalMedCard.isPresent())	{
            medCard = optionalMedCard.get();
        }
        mav.addObject("medCard", medCard);
        volunteerActionService.savelog("Volunteer show update a medical card for a pet");
        return mav;
    }

    @GetMapping("/deletePet")
    public String deletePet(@RequestParam Long medCardId)	{
        medCardRepository.deleteById(medCardId);
        volunteerActionService.savelog("Volunteer delete a medical card for a pet");
        return "redirect:/list";
    }
    
}
