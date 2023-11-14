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
@Table(name = "MEDICAL_RECORDS")

public class MedCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "Sterilization")
    private Date sterilization;

    @Column(name = "VetClinicAddress", nullable = false)
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
