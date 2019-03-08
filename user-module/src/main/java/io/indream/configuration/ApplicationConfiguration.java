package io.indream.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.indream.service.CustomerService;
import io.indream.service.CustomerServiceImpl;

@Configuration
public class ApplicationConfiguration {


	
	@Bean
	public CustomerService getService() {
		return new CustomerServiceImpl();
	}
}
