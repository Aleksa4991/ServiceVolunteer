package ru.project.servicevolunteer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.servicevolunteer.models.VolunteerActions;
import ru.project.servicevolunteer.repository.VolunteerActionsRepository;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
public class VolunteerActionServiceImpl implements VolunteerActionService {
    private VolunteerActionsRepository volunteerActionsRepository;

    @Autowired
    public VolunteerActionServiceImpl(
            VolunteerActionsRepository volunteerActionsRepository)
    {this.volunteerActionsRepository=volunteerActionsRepository;}
    @Override
    public void savelog(String status){
        Calendar calendar= new GregorianCalendar();
        VolunteerActions.setDate(calendar.getTime().toString());
        VolunteerActions.setAction(status);
        volunteerActionsRepository.save(new VolunteerActions());
    }
}
