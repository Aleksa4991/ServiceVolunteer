package ru.project.servicevolunteer.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "PETS")
public class Pet {
    @Id
    @Column(name = "Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nickname", nullable = false)
    private String nickname;

    @Column(name = "Category", nullable = false)
    private String category;

    @Column(name = "Gender", nullable = false)
    private String gender;

    @Column(name = "Breed", nullable = false)
    private String breed;

    @Column(name = "Color", nullable = false)
    private String color;

    @Column(name = "Size", nullable = false)
    private String size;

    @Column(name = "ApproximateAge", nullable = false)
    private Long approximateAge;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "DateOfAdmission")
    private Date dateOfAdmission;

    @Column(name = "RFIDChip", nullable = false, unique = true)
    private String rtidChip;

    @Column(name = "ShelterRegNum", nullable = false, unique = true)
    private String shelterRegNum;

    @Column(name = "EnclosureNum", nullable = false)
    private int enclosureNum;
}
