package com.demo.jenkins.DemoForJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.demo")
public class DemoForJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoForJenkinsApplication.class, args);
	}
}
