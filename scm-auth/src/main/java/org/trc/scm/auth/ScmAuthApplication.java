package org.trc.scm.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScmAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScmAuthApplication.class, args);
	}

}

