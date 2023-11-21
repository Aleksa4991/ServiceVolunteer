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
@Table(name = "MEDCARDS")

public class MedCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "Status", nullable = false)
    private String status;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "Sterilization")
    private Date sterilization;

    @Column(name = "VetClinicAddress")
    private String vetClinicAddress;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "FleaTreatment")
    private Date fleaTreatment;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "Deworming")
    private Date deworming;

    @Column(name = "NecessaryMedications")
    private String necessaryMedications;
}
