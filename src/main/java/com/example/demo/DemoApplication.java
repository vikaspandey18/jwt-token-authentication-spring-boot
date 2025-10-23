package com.example.demo;

import com.example.demo.entity.Role;
import com.example.demo.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner initRoles(RoleRepository roleRepo) {
		return args -> {
			if (roleRepo.findByName("ROLE_USER").isEmpty()) roleRepo.save(new Role(null,"ROLE_USER"));
			if (roleRepo.findByName("ROLE_ADMIN").isEmpty()) roleRepo.save(new Role(null,"ROLE_ADMIN"));
		};
	}
}
