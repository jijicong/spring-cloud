package org.trc.scmfinance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ScmFinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScmFinanceApplication.class, args);
	}

}

