package ru.project.servicevolunteer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.servicevolunteer.models.VolunteerAction;
import ru.project.servicevolunteer.repository.VolunteerActionRepository;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
public class VolunteerActionServiceImpl implements VolunteerActionService{

    private VolunteerActionRepository volunteerActionRepository;

    @Autowired
    public VolunteerActionServiceImpl(VolunteerActionRepository volunteerActionRepository) {
        this.volunteerActionRepository = volunteerActionRepository;
    }

    @Override
    public void savelog(String status){
        Calendar calendar = new GregorianCalendar();
        VolunteerAction volunteerAction = new VolunteerAction();
        volunteerAction.setDate(calendar.getTime().toString());
        volunteerAction.setAction(status);
        volunteerActionRepository.save(volunteerAction);
    }
}
