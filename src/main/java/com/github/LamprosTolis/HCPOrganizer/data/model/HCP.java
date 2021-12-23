package com.github.LamprosTolis.HCPOrganizer.data.model;

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
    private long hcp_Id;

    @Getter @Setter
    @Column(name="INFO")
    private String hcp_Info;

    @Getter @Setter
    @Column(name="FIRST_NAME")
    private String hcp_FirstName;

    @Getter @Setter
    @Column(name="LAST_NAME")
    private String hcp_LastName;



}
