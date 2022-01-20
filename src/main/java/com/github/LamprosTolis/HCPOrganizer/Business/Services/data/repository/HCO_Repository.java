package com.github.LamprosTolis.HCPOrganizer.Business.Services.data.repository;

import com.github.LamprosTolis.HCPOrganizer.Business.Services.data.model.HCO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HCO_Repository extends JpaRepository<HCO, Long> {


    Optional<HCO> findByName(String name);

    List<HCO> findAllByName(String name);
}