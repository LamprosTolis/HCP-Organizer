package com.github.LamprosTolis.HCPOrganizer.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Hospital {

    @Id
    @Column
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
