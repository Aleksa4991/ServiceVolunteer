package ru.project.servicevolunteer.models;
import javax.persistence.*;

import lombok.*;
import java.util.Date;
import org.hibernate.annotations.Table;
import org.springframework.format.annotation.DateTimeFormat;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PETS")
//класс представляет личную карточку животного
public class PersonalPetCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="Nickname",nullable=false)
    private String nickname;

    @Column(name="Category",nullable=false)
    private String category;

    @Column(name="Gender",nullable=false)
    private String gender;

    @Column(name="Breed",nullable=false)
    private String breed;

    @Column(name="Color",nullable=false)
    private String color;

    @Column(name="Size",nullable=false)
    private String size;

    @Column(name="ApproximateAge",nullable=false)
    private Long approximateAge;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name="DateOfAdmission")
    private Date dateOfAdmission;

}
