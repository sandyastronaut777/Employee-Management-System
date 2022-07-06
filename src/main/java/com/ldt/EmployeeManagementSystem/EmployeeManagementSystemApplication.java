package com.ldt.EmployeeManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.ldt.EmployeeManagementSystem.controller", "com.ldt.EmployeeManagementSystem.service"})
@EntityScan("com.ldt.EmployeeManagementSystem.entity")
@EnableJpaRepositories("com.ldt.EmployeeManagementSystem.repository")
public class EmployeeManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

}
