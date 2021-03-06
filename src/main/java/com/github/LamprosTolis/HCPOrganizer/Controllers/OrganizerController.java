package com.github.LamprosTolis.HCPOrganizer.Controllers;


import com.github.LamprosTolis.HCPOrganizer.Business.Services.HCOService;
import com.github.LamprosTolis.HCPOrganizer.Business.Services.HCPService;
import com.github.LamprosTolis.HCPOrganizer.Business.Services.data.model.HCP;
import com.github.LamprosTolis.HCPOrganizer.Business.Services.data.repository.HCO_Repository;
import com.github.LamprosTolis.HCPOrganizer.Business.Services.data.repository.HCP_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class OrganizerController{


    private final HCP_Repository hcpRepository;

    private final HCO_Repository hcoRepository;

    private final HCOService hcoService;
    private final HCPService hcpService;

    @Autowired
    public OrganizerController(HCP_Repository hcpRepository, HCO_Repository hcoRepository, HCOService hcoService, HCPService hcpService ) {
        this.hcpRepository = hcpRepository;
        this.hcoRepository = hcoRepository;
        this.hcoService = hcoService;
        this.hcpService = hcpService;
    }
}

