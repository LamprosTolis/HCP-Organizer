package com.github.LamprosTolis.HCPOrganizer.Controllers;

import com.github.LamprosTolis.HCPOrganizer.Business.Services.HCPService;
import com.github.LamprosTolis.HCPOrganizer.Business.Services.data.model.HCP;
import com.github.LamprosTolis.HCPOrganizer.Business.Services.data.repository.HCP_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value = "/{id}")
    public Optional<HCP> getHCPById(@PathVariable Long id){
        return this.hcpRepository.findById(id);
    }


    @PostMapping(value = "/create")
    @ResponseStatus(code = HttpStatus.CREATED)
    public HCP createHCP(@RequestBody HCP hcp){
        return hcpService.createHCP(hcp);
    }
}
