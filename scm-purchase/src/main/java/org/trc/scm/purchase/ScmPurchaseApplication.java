package org.trc.scm.purchase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ScmPurchaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScmPurchaseApplication.class, args);
	}

}

