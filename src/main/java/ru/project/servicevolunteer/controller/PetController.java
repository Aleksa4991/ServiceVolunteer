package ru.project.servicevolunteer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.project.servicevolunteer.models.PersonalPetCard;

import java.util.Optional;

@Slf4j
@Controller
public class PetController {
    @Autowired
    private PersonalPetCardRepository personalPetCardRepository;
    @Autowired
    private VolunteerActionService volunteerActionService;

    @GetMapping("/list")
    public ModelAndView getAllPets()	{
        log.info("/list -> connection");
        ModelAndView mav = new ModelAndView("list-pets");
        mav.addObject("pets", personalPetCardRepository.findAll());
        volunteerActionService.savelog("Volunteer get all pets");
        return mav;
    }

    @GetMapping("/addPetForm")
    public ModelAndView addPetForm()	{
        ModelAndView mav = new ModelAndView("add-pet-form");
        PersonalPetCard personalPetCard = new PersonalPetCard();
        mav.addObject("pet", personalPetCard);
        volunteerActionService.savelog("Volunteer add pet");
        return mav;
    }

    @PostMapping("/savePet")
    public String savePet(@ModelAttribute PersonalPetCard personalPetCard)	{
        personalPetCardRepository.save(personalPetCard);
        volunteerActionService.savelog("Volunteer save pet");
        return "redirect:/list";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Long personalPetCardId)	{
        ModelAndView mav = new ModelAndView("add-pet-form");
        Optional<PersonalPetCard> optionalPersonalPetCard = personalPetCardRepository.findById(personalPetCardId);
        PersonalPetCard personalPetCard = new PersonalPetCard();
        if(optionalPersonalPetCard.isPresent())	{
            personalPetCard = optionalPersonalPetCard.get();
        }
        mav.addObject("pet", personalPetCard);
        volunteerActionService.savelog("Volunteer show update form");
        return mav;
    }

    @GetMapping("/deletePet")
    public String deletePet(@RequestParam Long personalPetCardId)	{
        personalPetCardRepository.deleteById(personalPetCardId);
        volunteerActionService.savelog("Volunteer delete pet");
        return "redirect:/list";
    }
}
