package com.github.LamprosTolis.HCPOrganizer.Business.Domain;

import java.util.Date;

public class PatientRecord {

    private long patientId;
    private long doctorId;
    private String patientFirstName;
    private String patientLastName;
    private String patientInfo;
    private Date date;

    public void getPatientId(long patientId) {
        this.patientId = patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(String patientInfo) {
        this.patientInfo = patientInfo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
