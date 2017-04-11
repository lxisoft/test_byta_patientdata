package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  registrationController {
	@RequestMapping("/wildcardSearching")
	public String CurrentDetailRegistration() {
		return "wildcardSearching completed";
	}
}
