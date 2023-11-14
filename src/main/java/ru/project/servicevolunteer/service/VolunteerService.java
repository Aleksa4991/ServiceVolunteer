package ru.project.servicevolunteer.service;

import ru.project.servicevolunteer.dto.VolunteerDto;
import ru.project.servicevolunteer.models.Volunteer;
import java.util.List;

public interface VolunteerService {
    void saveVolunteer(VolunteerDto volunteerDto);
    Volunteer findVolunteerByEmail(String email);
    List<VolunteerDto> findAllVolunteers();
}
