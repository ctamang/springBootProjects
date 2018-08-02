package com.example.ctech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerTestApplication.class, args);
	}
}
