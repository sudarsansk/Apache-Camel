package com.practice.apachecamel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@ComponentScan(basePackages = {"com.practice.apachecamel"})
public class ApachecamelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApachecamelApplication.class, args);
	}
	
	@Bean
	public static CommandLineRunner validate(JdbcTemplate jdbcTemplate) {
		System.out.println("Sudarsan");
		return args -> {
			Integer result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
		};
	}

}
