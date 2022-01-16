package com.github.LamprosTolis.HCPOrganizer.Controllers;

import com.github.LamprosTolis.HCPOrganizer.Business.Services.HCOService;
import com.github.LamprosTolis.HCPOrganizer.data.model.HCO;
import com.github.LamprosTolis.HCPOrganizer.data.repository.HCO_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/HCO")
public class HCOController {

    private final HCO_Repository hcoRepository;

    private final HCOService hcoService;

    @Autowired
    public HCOController(HCO_Repository hcoRepository, HCOService hcoService) {
        this.hcoRepository = hcoRepository;
        this.hcoService = hcoService;

    }

    // =========== HCO Requests =============

    // Getting all HCOs
    @GetMapping(value = "/all-hco")
    public Iterable<HCO> getAllHCO() {
        return this.hcoRepository.findAll();
    }

    // Getting HCO by ID
    @GetMapping(value = "/{id}")
    public Optional<HCO> getHCOById(@PathVariable Long id) {
        return this.hcoRepository.findById(id);
    }

    // Getting HCO by Name
    @GetMapping(value = "/name")
    public HCO getHCPbyName(@RequestParam String name) {
        return hcoService.getHCObyName(name);
    }

    // Getting a List of HCO with given name
    @GetMapping(value = "/all-with-name")
    public List<HCO> getAllHCPbyName(@RequestParam String name) {
        return hcoService.getAllHCObyName(name);
    }
}
