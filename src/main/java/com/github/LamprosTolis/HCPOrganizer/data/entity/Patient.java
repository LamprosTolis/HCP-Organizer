package com.github.LamprosTolis.HCPOrganizer.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="PATIENTS")
@NoArgsConstructor
public class Patient {

    @Id
    @Column(name="PATIENT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long patientId;

    @Getter @Setter
    @Column(name="FIRST_NAME")
    private String patientFirstName;

    @Getter @Setter
    @Column(name="LAST_NAME")
    private String patientLastName;

    @Getter @Setter
    @Column(name="PATIENT_INFO")
    private String patientInfo;

}
