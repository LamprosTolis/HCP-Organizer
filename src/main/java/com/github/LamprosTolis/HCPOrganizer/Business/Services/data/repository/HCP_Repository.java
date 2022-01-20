package com.github.LamprosTolis.HCPOrganizer.Business.Services.data.repository;

import com.github.LamprosTolis.HCPOrganizer.Business.Services.data.model.HCP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HCP_Repository extends JpaRepository<HCP, Long> {

}
