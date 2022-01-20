package com.github.LamprosTolis.HCPOrganizer.Business.Services.data.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="HCO")
public class HCO {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long id;

    @Getter @Setter
    @Column(name="NAME")
    private String name;

    @Getter @Setter
    @Column(name="ADDRESS")
    private String address;

    @Getter @Setter
    @Column(name="COUNTRY")
    private String country;

    @Getter @Setter
    @Column(name="WEBSITE_URL")
    private String websiteURL;

    // Speciality on this case can mean what special clinics the HCO has.
    @Getter @Setter
    @Column(name="SPECIALITY")
    private String speciality;

    @Getter @Setter
    @Column(name="INFO")
    private String info;

}
