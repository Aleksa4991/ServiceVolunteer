package ru.project.servicevolunteer.service;

import org.springframework.stereotype.Service;

@Service
public interface VolunteerActionService {
    void savelog(String status);
}
