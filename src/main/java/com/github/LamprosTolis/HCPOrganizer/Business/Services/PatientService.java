package com.github.LamprosTolis.HCPOrganizer.Business.Services;

import com.github.LamprosTolis.HCPOrganizer.Business.Services.data.repository.HCP_Repository;
import com.github.LamprosTolis.HCPOrganizer.Business.Services.data.repository.HCO_Repository;
import com.github.LamprosTolis.HCPOrganizer.Business.Services.data.repository.Patient_Repository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter @Setter
public class PatientService {
    private final HCP_Repository hcpRepository;
    private final HCO_Repository hcoRepository;
    private final Patient_Repository patientRepository;

    @Autowired
    public PatientService(HCP_Repository HCPRepository, HCO_Repository HCORepository, Patient_Repository patientRepository) {
        this.hcpRepository = HCPRepository;
        this.hcoRepository = HCORepository;
        this.patientRepository = patientRepository;
    }

//    public List<PatientRecord> getAllPatientsForDate(Date date){
//        Iterable<Patient> patients = this.patientRepository.findAll();
//        Map<Long, PatientRecord> patientRecordMap = new HashMap();
//        patients.forEach(patient -> {
//            PatientRecord patientRecord = new PatientRecord();
//            patientRecord.setPatientId(patient.getPatient_Id());
//            patientRecordMap.put(patient.getPatient_Id(), patientRecord);
//        });
//        return null;
//    }
}
