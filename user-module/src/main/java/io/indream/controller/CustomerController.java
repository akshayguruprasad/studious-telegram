package io.indream.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import io.indream.model.CustomerEntity;
import io.indream.model.CustomerRegisterationDTO;
import io.indream.service.CustomerService;
import io.indream.util.Utility;

@RestController
@RestControllerAdvice
public class CustomerController {
	private static final Logger LOGGER = Logger.getLogger(CustomerController.class);
	@Autowired
	private CustomerService customerService;

	@GetMapping("/")
	public String healthCheck() {
		return "Healthy";
	}

	@PostMapping(value = "/register", consumes = "application/json", produces = "application/json")
	public boolean registerCustomer(@RequestBody CustomerRegisterationDTO customerRegsiteration) {
		CustomerEntity customerEntity = null;
		boolean isRegisterationSuccess = false;
		try {
			LOGGER.info("Registeration started....");
			LOGGER.info(customerRegsiteration);
			customerEntity = Utility.convertObject(customerRegsiteration, CustomerEntity.class);
			isRegisterationSuccess = customerService.registeration(customerEntity);

		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			throw new RuntimeException(e.getMessage());
		}
		return isRegisterationSuccess;
	}
}
