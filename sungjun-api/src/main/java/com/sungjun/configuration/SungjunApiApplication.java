package com.sungjun.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.sungjun")
@EnableAutoConfiguration
public class SungjunApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SungjunApiApplication.class, args);
	}
}
