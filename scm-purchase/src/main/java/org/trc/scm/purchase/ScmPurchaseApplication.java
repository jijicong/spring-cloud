package org.trc.scm.purchase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ScmPurchaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScmPurchaseApplication.class, args);
	}

}

