package com.github.LamprosTolis.HCPOrganizer.Business.Services;

import com.github.LamprosTolis.HCPOrganizer.Business.Domain.PatientRecord;
import com.github.LamprosTolis.HCPOrganizer.data.entity.Patient;
import com.github.LamprosTolis.HCPOrganizer.data.repository.DoctorRepository;
import com.github.LamprosTolis.HCPOrganizer.data.repository.HospitalRepository;
import com.github.LamprosTolis.HCPOrganizer.data.repository.PatientRecordRepository;
import com.github.LamprosTolis.HCPOrganizer.data.repository.PatientRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter @Setter
public class PatientRecordService {
    private final DoctorRepository doctorRepository;
    private final HospitalRepository HospitalRepository;
    private final PatientRepository patientRepository;
    private final PatientRecordRepository patientRecordRepository;

    @Autowired
    public PatientRecordService(DoctorRepository doctorRepository, HospitalRepository hospitalRepository, PatientRepository patientRepository, PatientRecordRepository patientRecordRepository) {
        this.doctorRepository = doctorRepository;
        this.HospitalRepository = hospitalRepository;
        this.patientRepository = patientRepository;
        this.patientRecordRepository = patientRecordRepository;
    }

    public List<PatientRecord> getAllPatientsForDate(Date date){
        Iterable<Patient> patients = this.patientRepository.findAll();
        Map<Long, PatientRecord> patientRecordMap = new HashMap();
        patients.forEach(patient -> {
            PatientRecord patientRecord = new PatientRecord();
            patientRecord.setPatientId(patient.getPatientId());
            patientRecordMap.put(patient.getPatientId(), patientRecord);
        });

//        Iterable<Patient> patients = this.patientRecordRepository.findPatientRecordByDate(new java.sql.Date(date.getTime()));
//        patientRecords.forEach(patientRecord -> {
//            PatientRecord patientRecord = patientRecordMap.get(patientRecord.getPatientId());
//        });
        return null;
    }
}
