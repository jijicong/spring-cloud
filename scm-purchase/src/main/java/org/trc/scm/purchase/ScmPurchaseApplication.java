package org.trc.scm.purchase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@tk.mybatis.spring.annotation.MapperScan(basePackages = "org.trc.scm.purchase.dao")
public class ScmPurchaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScmPurchaseApplication.class, args);
	}

}

