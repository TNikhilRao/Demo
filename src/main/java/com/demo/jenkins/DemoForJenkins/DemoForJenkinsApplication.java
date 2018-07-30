package com.demo.jenkins.DemoForJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.demo")
public class DemoForJenkinsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemoForJenkinsApplication.class, args);
	}
}
