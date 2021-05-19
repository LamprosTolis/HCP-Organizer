package com.github.LamprosTolis.HCPOrganizer.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="DOCTORS")
@NoArgsConstructor
public class Doctor {

    @Id
    @Column(name="DOCTOR_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long doctorId;

    @Getter @Setter
    @Column(name="FIRST_NAME")
    private String doctorFirstName;

    @Getter @Setter
    @Column(name="LAST_NAME")
    private String doctorLastName;

    @Getter @Setter
    @Column(name="DOCTOR_INFO")
    private String doctorInfo;

}
