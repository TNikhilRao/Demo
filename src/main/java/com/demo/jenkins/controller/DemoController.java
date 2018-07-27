package com.demo.jenkins.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@GetMapping("/{name}")
	public ResponseEntity<String> printMsg(@PathVariable("name") String name) {

		String str = "Hi , " + name + "\tHow Are you?";

		return new ResponseEntity<String>(str, HttpStatus.OK);

	}

}
