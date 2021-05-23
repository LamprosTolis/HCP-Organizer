package com.github.LamprosTolis.HCPOrganizer.data.repository;

import com.github.LamprosTolis.HCPOrganizer.data.entity.Hospital;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Long> {

}
