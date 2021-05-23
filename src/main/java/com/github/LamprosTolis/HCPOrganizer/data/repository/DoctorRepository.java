package com.github.LamprosTolis.HCPOrganizer.data.repository;

import com.github.LamprosTolis.HCPOrganizer.data.entity.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {

}
