package com.github.LamprosTolis.HCPOrganizer.data.model;

import jdk.net.SocketFlow;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Table(name="HCP")
public class HCP {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long id;

    @Getter @Setter
    @Column(name="FIRST_NAME")
    private String firstName;

    @Getter @Setter
    @Column(name="LAST_NAME")
    private String lastName;

    @Getter @Setter
    @Column(name="SPECIALITY")
    private String speciality;

    @Getter @Setter
    @Column(name="EMAIL")
    private String email;

    @Getter @Setter
    @Column(name="ADDRESS")
    private String address;

    @Getter @Setter
    @Column(name="COUNTRY")
    private String country;

    @Getter @Setter
    @Column(name="STATUS")
    private boolean status;

    @Getter @Setter
    @Column(name="INFO")
    private String info;
}
