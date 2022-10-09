package com.tareq.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
}

@RestController
class FallbackController{
	Logger logger=Logger.getLogger(this.getClass().getName());

	@GetMapping("/employee-fallback")
	public EmployeeResponse getDefault(){
		EmployeeResponse response = new EmployeeResponse();
		response.setDefault();
		logger.log(Level.INFO,"employee-fallback");
		return response;
	}

	@GetMapping("/project-fallback")
	public EmployeeResponse getproject(){
		EmployeeResponse response = new EmployeeResponse();
		response.setDefault();
		logger.log(Level.INFO,"project-fallback");
		return response;
	}
}