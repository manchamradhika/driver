package com.example.driver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class driverController {
	@GetMapping(path="/pro")
	public String getdata() { 
		return "HEllo";
	}

}
