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
import ru.project.servicevolunteer.repository.MedCardRepository;
import ru.project.servicevolunteer.service.VolunteerActionService;

import java.util.Optional;

@Slf4j
@Controller
public class MedCardController {
    @Autowired
    private MedCardRepository medCardRepository;
    @Autowired
    private VolunteerActionService volunteerActionService;

    @GetMapping("/addMedForm")
    public ModelAndView addMedForm()	{
        ModelAndView mav = new ModelAndView("add-med-form");
        MedCard medCard = new MedCard();
        mav.addObject("medCard", medCard);
        volunteerActionService.savelog("Volunteer add pet's medical card");
        return mav;
    }

    @PostMapping("/saveMedCard")
    public String saveMedCard(@ModelAttribute MedCard medCard)	{
        medCardRepository.save(medCard);
        volunteerActionService.savelog("Volunteer save pet");
        return "redirect:/list";
    }

    @GetMapping("/showUpdateMedCard")
    public ModelAndView showUpdateMedCard(@RequestParam Long medCardId)	{
        ModelAndView mav = new ModelAndView("update-med-form");
        Optional<MedCard> optionalMedCard = medCardRepository.findById(medCardId);
        MedCard medCard = new MedCard();
        if(optionalMedCard.isPresent())	{
            medCard= optionalMedCard.get();
        }
        mav.addObject("medCard", medCard);
        volunteerActionService.savelog("Volunteer update medical card");
        return mav;
    }

    @PostMapping("/updateMedCard")
    public String updateMedCard(@ModelAttribute MedCard medCard)	{
        medCardRepository.save(medCard);
        volunteerActionService.savelog("Volunteer update and save medical card");
        return "redirect:/list";
    }

}
