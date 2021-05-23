package com.github.LamprosTolis.HCPOrganizer;

import com.github.LamprosTolis.HCPOrganizer.data.entity.Doctor;
import com.github.LamprosTolis.HCPOrganizer.data.entity.Hospital;
import com.github.LamprosTolis.HCPOrganizer.data.repository.DoctorRepository;
import com.github.LamprosTolis.HCPOrganizer.data.repository.HospitalRepository;
import com.github.LamprosTolis.HCPOrganizer.data.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HcpOrganizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcpOrganizerApplication.class, args);
	}

	@RestController
	@RequestMapping("/doctors")
	public class doctorController{
		@Autowired
		private DoctorRepository doctorRepository;
		private HospitalRepository hospitalRepository;
		private PatientRepository PatientRepository;

		@GetMapping
		public Iterable<Doctor> getDoctors(){
			return this.doctorRepository.findAll();
		}
	}
//
//	@RestController
//	@RequestMapping("/hospitals")
//	public class hospitalController{
//		@Autowired
//		private HospitalRepository hospitalRepository;
//
////		@GetMapping
////		public Iterable<Doctor> getDoctors(){
////			return this.hospitalRepository.findAll();
////		}
//	}
//
//	@RestController
//	@RequestMapping("/hospitals")
//	public class PatientController{
//		@Autowired
//		private PatientRepository patientRepository;
//
////		@GetMapping
////		public Iterable<Doctor> getDoctors(){
////			return this.hospitalRepository.findAll();
////		}
//	}


}
