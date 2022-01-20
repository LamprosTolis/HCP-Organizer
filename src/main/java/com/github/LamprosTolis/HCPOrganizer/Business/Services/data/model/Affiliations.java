package com.github.LamprosTolis.HCPOrganizer.Business.Services.data.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="Affiliations")
public class Affiliations {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private long id;

//    @Id
//    @Column
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Getter
//    @Setter
//    private long HCP_Id;

//    @Id
//    @Column
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Getter
//    @Setter
//    private long HCO_Id;
}
