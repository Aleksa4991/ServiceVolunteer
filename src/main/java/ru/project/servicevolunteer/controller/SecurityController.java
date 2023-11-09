package ru.project.servicevolunteer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.project.servicevolunteer.dto.VolunteerDto;
import ru.project.servicevolunteer.models.Volunteer;
import ru.project.servicevolunteer.service.VolunteerService;

import javax.validation.Valid;

@Controller
public class SecurityController	{
    private VolunteerService volunteerService;

    public SecurityController(VolunteerService volunteerService)	{
        this.volunteerService = volunteerService;
    }

    @GetMapping("/index")
    public String home()	{
        return "index";
    }

    @GetMapping("/login")
    public String login()	{
        return "login";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model)	{
        VolunteerDto volunteer = new VolunteerDto();
        model.addAttribute("volunteer", volunteer);
        return "register";
    }

    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("volunteer") VolunteerDto volunteerDto, BindingResult result, Model model)	{
        Volunteer existingVolunteer = volunteerService.findVolunteerByEmail(volunteerDto.getEmail());
        if(existingVolunteer != null && existingVolunteer.getEmail() != null && !existingVolunteer.getEmail().isEmpty())	{
            result.rejectValue("email", null, "На этот адрес электронной почты уже зарегистрирована учетная запись");
        }
        if(result.hasErrors())	{
            model.addAttribute("volunteer", volunteerDto);
            return "/register";
        }
        volunteerService.saveVolunteer(volonteerDto);
        return "redirect:/register?success";
    }

    @GetMapping("/volonteers")
    public String volunteers(Model model)	{
        List<VolonteerDto> volunteers = volunteerService.findAllVolunteers();
        model.addAttribute("volunteers", volunteers);
        return "volunteer";
    }
}
