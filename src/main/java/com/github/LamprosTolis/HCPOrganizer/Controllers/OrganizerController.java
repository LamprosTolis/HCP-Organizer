package com.github.LamprosTolis.HCPOrganizer.Controllers;


import com.github.LamprosTolis.HCPOrganizer.data.model.HCP;
import com.github.LamprosTolis.HCPOrganizer.data.model.HCO;
import com.github.LamprosTolis.HCPOrganizer.data.repository.HCP_Repository;
import com.github.LamprosTolis.HCPOrganizer.data.repository.HCO_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class OrganizerController{

    @Autowired
    private HCP_Repository hcp_Repository;
    @Autowired
    private HCO_Repository hco_Repository;

    public OrganizerController(HCP_Repository hcp_repository, HCO_Repository hco_repository) {
        hcp_Repository = hcp_repository;
        hco_Repository = hco_repository;
    }

    // ========== HCP Requests ===============

    // Getting all HCPs
    @RequestMapping("/HCP/all")
    @GetMapping
    public Iterable<HCP> get_all_HCP(){ return this.hcp_Repository.findAll(); }

    // Getting HCP by Id
    @RequestMapping("/HCP/{Id}")
    @GetMapping
    public Optional<HCP> get_HCP_byId(@PathVariable Long Id){
        return this.hcp_Repository.findById(Id);
    }

    // =========== HCO Requests =============

    // Getting all HCOs
    @RequestMapping("/HCO/all")
    @GetMapping
    public Iterable<HCO> get_all_HCO(){ return this.hco_Repository.findAll(); }

    // Getting HCO by Id
    @RequestMapping("/HCO/{Id}")
    @GetMapping
    public Optional<HCO> get_HCO_byId(@PathVariable Long Id){
        return this.hco_Repository.findById(Id);
    }

    // Getting HCO by Name
    @RequestMapping("/HCO/{Name}")
    @GetMapping
    public List<HCO> get_HCP_byName(@PathVariable String Name){
        return this.hco_Repository.findByName(Name);
    }
}

