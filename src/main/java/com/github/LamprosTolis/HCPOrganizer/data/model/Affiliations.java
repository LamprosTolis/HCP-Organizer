package com.github.LamprosTolis.HCPOrganizer.data.model;

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
    private long Affiliations_Id;
}
