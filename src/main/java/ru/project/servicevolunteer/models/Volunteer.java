package ru.project.servicevolunteer.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "VOLUNTEERS")
public class Volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Username", nullable = false, unique = true)
    private String username;
    @Column(name = "Email", nullable = false, unique = true)
    private String email;
    @Column(name = "Password", nullable = false)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "volunteers_roles",
            joinColumns = {@JoinColumn(name = "volunteer_id", referencedColumnName = "id")},
            inverseJoinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id")}
    )
    private List<Role> roles = new ArrayList<>();
}