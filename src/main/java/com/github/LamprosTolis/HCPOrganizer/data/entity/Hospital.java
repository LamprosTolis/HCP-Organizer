package com.github.LamprosTolis.HCPOrganizer.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="HOSPITALS")
@NoArgsConstructor
public class Hospital {

    @Id
    @Column(name="HOSPITAL_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long hospitalId;

    @Getter @Setter
    @Column(name="HOSPITAL_NAME")
    private String HospitalName;

    @Getter @Setter
    @Column(name="HOSPITAL_ADDRESS")
    private String hospitalAddress;

    @Getter @Setter
    @Column(name="HOSPITAL_INFO")
    private String hospitalInfo;

}
