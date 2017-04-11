package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  registrationController {
	@RequestMapping("/CurrentDetailRegistration")
	public String CurrentDetailRegistration() {
		return "CurrentDetailRegistration completed";
	}
}
