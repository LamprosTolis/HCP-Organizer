package com.github.LamprosTolis.HCPOrganizer.data.model;

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
    private long hco_Id;

    @Getter @Setter
    @Column(name="NAME")
    private String hco_Name;

    @Getter @Setter
    @Column(name="ADDRESS")
    private String hco_Address;

    @Getter @Setter
    @Column(name="INFO")
    private String hco_Info;

}
