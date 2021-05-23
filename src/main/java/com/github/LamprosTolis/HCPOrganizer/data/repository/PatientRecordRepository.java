package com.github.LamprosTolis.HCPOrganizer.data.repository;

import com.github.LamprosTolis.HCPOrganizer.Business.Domain.PatientRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface PatientRecordRepository extends CrudRepository<PatientRecord, Long> {
    Iterable<PatientRecord> findPatientRecordByDate(Date date);
}
