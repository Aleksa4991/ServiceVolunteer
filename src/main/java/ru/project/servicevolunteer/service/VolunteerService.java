package ru.project.servicevolunteer.service;
import org.springframework.stereotype.Service;
import ru.project.servicevolunteer.dto.VolunteerDto;
import ru.project.servicevolunteer.models.Volunteer;
import java.util.List;
@Service
public interface VolunteerService {
    void saveVolunteer(VolunteerDto volunteerDto);
    Volunteer findVolunteerByEmail(String email);
    List<VolunteerDto> findAllVolunteers();
}
