package ru.project.servicevolunteer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.project.servicevolunteer.models.Pet;
import ru.project.servicevolunteer.repository.MedCardRepository;
import ru.project.servicevolunteer.repository.PetRepository;
import ru.project.servicevolunteer.service.VolunteerActionService;

import java.util.Optional;

@Slf4j
@Controller
public class PetController {
    @Autowired
    private PetRepository petRepository;
    @Autowired
    private MedCardRepository medCardRepository;
    @Autowired
    private VolunteerActionService volunteerActionService;

    @GetMapping("/list")
    public ModelAndView getAllPets() {
        log.info("/list -> connection");
        ModelAndView mav = new ModelAndView("list-pets");
        mav.addObject("pets", petRepository.findAll());
        mav.addObject("medcards", medCardRepository.findAll());
        volunteerActionService.savelog("Volunteer get all pets");
        return mav;
    }

    @GetMapping("/addPetForm")
    public ModelAndView addPetForm()	{
        ModelAndView mav = new ModelAndView("add-pet-form");
        Pet pet = new Pet();
        mav.addObject("pet", pet);
        volunteerActionService.savelog("Volunteer add pet");
        return mav;
    }


    @PostMapping("/followToTheMedCard")
    public String savePet(@ModelAttribute Pet pet)	{
        petRepository.save(pet);
        volunteerActionService.savelog("Volunteer save pet");
        return "redirect:/addMedForm";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Long petId)	{
        ModelAndView mav = new ModelAndView("update-pet-form2");
        Optional<Pet> optionalPet = petRepository.findById(petId);
        Pet pet = new Pet();
        if(optionalPet.isPresent())	{
            pet = optionalPet.get();
        }
        mav.addObject("pet", pet);
        volunteerActionService.savelog("Volunteer update pet's card");
        return mav;
    }

    @GetMapping("/deletePet")
    public String deletePet(@RequestParam Long petId)	{
        petRepository.deleteById(petId);
        medCardRepository.deleteById(petId);
        volunteerActionService.savelog("Volunteer delete pet");
        return "redirect:/list";
    }

    @PostMapping("/updatePet")
    public String updatePet(@ModelAttribute Pet pet)	{
        petRepository.save(pet);
        volunteerActionService.savelog("Volunteer update and save pet");
        return "redirect:/list";
    }
}