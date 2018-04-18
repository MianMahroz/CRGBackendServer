package com.bestercapitalmedia.chiragh.CRGBackendServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.bestercapitalmedia"})
@EnableJpaRepositories("com.bestercapitalmedia")
@EntityScan("com.bestercapitalmedia")
@PropertySource(value={"classpath:application.properties"})
public class CrgBackendServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrgBackendServerApplication.class, args);
	}
}
