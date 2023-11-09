package ru.project.servicevolunteer.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.project.servicevolunteer.repository.VolunteerRepository;

public class CustomVolunteerDetailsService  implements UserDetailsService {
    private VolunteerRepository volunteerRepository;
    public CustomVolunteerDetailsService(VolunteerRepository volunteerRepository)
    { this.volunteerRepository=volunteerRepository;}
    @Override
    public VolunteerDetails loadVolunteerByUsername(String usernameOrEmail);
    if(volunteer !=null) {

    }
}
