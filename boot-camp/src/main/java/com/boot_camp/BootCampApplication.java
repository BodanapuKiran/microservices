package com.boot_camp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BootCampApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCampApplication.class, args);
	}

}
