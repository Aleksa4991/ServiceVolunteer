package ru.project.servicevolunteer.service;
import ru.project.servicevolunteer.entity.VolunteerActions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.project.servicevolunteer.dto.VolunteerDto;
import ru.project.servicevolunteer.models.Role;
import ru.project.servicevolunteer.models.Volunteer;
import ru.project.servicevolunteer.repository.RoleRepository;
import ru.project.servicevolunteer.repository.VolunteerRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VolunteerServiceImpl implements VolunteerService {
    private final VolunteerRepository volunteerRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public VolunteerServiceImpl(VolunteerRepository volunteerRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.volunteerRepository = volunteerRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void saveVolunteer(VolunteerDto volunteerDto) {
        Volunteer volunteer = new Volunteer();
        volunteer.setUsername(volunteerDto.getUsername());
        volunteer.setEmail(volunteerDto.getEmail());
        volunteer.setPassword(passwordEncoder.encode(volunteerDto.getPassword()));
        Role role = (Role) roleRepository.findByName("ROLE_ADMIN");
        if (role == null) {
            role = checkRoleExist();
        }
        volunteer.setRoles(Arrays.asList((org.springframework.context.annotation.Role) role));
        volunteerRepository.save(volunteer);
    }

    @Override
    public Volunteer findVolunteerByEmail(String email) {
        return volunteerRepository.findByEmail(email);
    }

    @Override
    public List<VolunteerDto> findAllVolunteers() {
        List<Volunteer> volunteers = volunteerRepository.findAll();
        return volunteers.stream().map((volunteer) -> mapToVolunteerDto(volunteer)).collect(Collectors.toList());
    }

    private VolunteerDto mapToVolunteerDto(Volunteer volunteer) {
        VolunteerDto volunteerDto = new VolunteerDto();
        String[] str = volunteer.getUsername().split(" ");
        volunteerDto.setUsername(str[0]);
        volunteerDto.setEmail(volunteer.getEmail());
        return volunteerDto;
    }

    private Role checkRoleExist()	{
        Role role = new Role();
        role.setName("ROLE_ADMIN");
        return roleRepository.save(role);
    }
}
