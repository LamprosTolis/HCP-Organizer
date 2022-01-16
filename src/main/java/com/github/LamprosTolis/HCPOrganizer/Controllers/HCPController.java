package com.github.LamprosTolis.HCPOrganizer.Controllers;

import com.github.LamprosTolis.HCPOrganizer.Business.Services.HCPService;
import com.github.LamprosTolis.HCPOrganizer.data.model.HCP;
import com.github.LamprosTolis.HCPOrganizer.data.repository.HCP_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/HCP")
public class HCPController {

    private final HCP_Repository hcpRepository;

    private final HCPService hcpService;

    @Autowired
    public HCPController(HCP_Repository hcpRepository, HCPService hcpService ) {
        this.hcpRepository = hcpRepository;
        this.hcpService = hcpService;

    }


    // ========== HCP Requests ===============

    // Getting all HCPs
    @GetMapping(value = "/all")
    public Iterable<HCP> getAllHCP(){ return this.hcpRepository.findAll(); }

    // Getting HCP by ID
    @GetMapping(value = "/{Id}")
    public Optional<HCP> getHCPById(@PathVariable Long id){
        return this.hcpRepository.findById(id);
    }

}
