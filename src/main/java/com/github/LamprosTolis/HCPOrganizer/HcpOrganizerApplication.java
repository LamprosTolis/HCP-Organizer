package com.github.LamprosTolis.HCPOrganizer;

import com.github.LamprosTolis.HCPOrganizer.data.entity.Doctor;
import com.github.LamprosTolis.HCPOrganizer.data.repository.DoctorRepository;
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
	public class RoomController{
		@Autowired
		private DoctorRepository doctorRepository;

		@GetMapping
		public Iterable<Doctor> getDoctors(){
			return this.doctorRepository.findAll();
		}
	}

}
