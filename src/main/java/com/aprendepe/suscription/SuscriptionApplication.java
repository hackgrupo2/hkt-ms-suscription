package com.aprendepe.suscription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SuscriptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuscriptionApplication.class, args);
	}

}
