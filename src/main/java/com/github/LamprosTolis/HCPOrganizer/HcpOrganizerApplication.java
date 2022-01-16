package com.github.LamprosTolis.HCPOrganizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class HcpOrganizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcpOrganizerApplication.class, args);
	}
}
