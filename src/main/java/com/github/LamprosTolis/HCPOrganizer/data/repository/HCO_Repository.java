package com.github.LamprosTolis.HCPOrganizer.data.repository;

import com.github.LamprosTolis.HCPOrganizer.data.model.HCO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HCO_Repository extends JpaRepository<HCO, Long> {

    List<HCO> findByName(String Name);
}
