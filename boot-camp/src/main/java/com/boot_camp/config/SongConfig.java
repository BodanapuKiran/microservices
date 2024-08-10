package com.boot_camp.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SongConfig {

	/*
	 * @Value("${Studentservice.base.url}") private String studentbaseUrl;
	 */

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	/*
	 * @Bean public RestTemplate restTemplate() { return new RestTemplate(); }
	 * 
	 * @Bean public WebClient webclient() { return
	 * WebClient.builder().baseUrl(studentbaseUrl).build();
	 * 
	 * }
	 */

}
