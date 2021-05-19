package com.github.LamprosTolis.HCPOrganizer.data.repository;

import com.github.LamprosTolis.HCPOrganizer.data.entity.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {
}
