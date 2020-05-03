package com.anup.docker.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloDocker {
	
	@GetMapping
	public String hello() {
		return "Hello Docker again!";
	}
}
