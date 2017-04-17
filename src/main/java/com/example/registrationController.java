package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  registrationController {
	@RequestMapping("/registration")
	public String CurrentDetailRegistration() {
		return " registration completed ";
	}
}
 