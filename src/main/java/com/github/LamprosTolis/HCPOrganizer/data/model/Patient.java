package com.github.LamprosTolis.HCPOrganizer.data.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="PATIENTS")
public class Patient {

    @Id
    @Column(name="PATIENT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long patient_Id;

    @Getter @Setter
    @Column(name="FIRST_NAME")
    private String patient_FirstName;

    @Getter @Setter
    @Column(name="LAST_NAME")
    private String patient_LastName;

    @Getter @Setter
    @Column(name="PATIENT_INFO")
    private String patient_Info;

}