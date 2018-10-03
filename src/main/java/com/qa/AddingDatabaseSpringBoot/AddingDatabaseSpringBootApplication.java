package com.qa.AddingDatabaseSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AddingDatabaseSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddingDatabaseSpringBootApplication.class, args);
	}
}
