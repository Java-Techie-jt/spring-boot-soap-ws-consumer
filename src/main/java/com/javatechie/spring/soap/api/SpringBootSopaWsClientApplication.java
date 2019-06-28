package com.javatechie.spring.soap.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.soap.api.clinet.SoapClinet;
import com.javatechie.spring.soap.api.loaneligibility.Acknowledgement;
import com.javatechie.spring.soap.api.loaneligibility.CustomerRequest;

@SpringBootApplication
@RestController
public class SpringBootSopaWsClientApplication {
	
	@Autowired
	private SoapClinet clinet;
	
	@PostMapping("/getLoanStatus")
	public Acknowledgement invokeSoapClientToGetLoanStatus(@RequestBody CustomerRequest request) {
		return clinet.getLoanStatus(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSopaWsClientApplication.class, args);
	}

}
