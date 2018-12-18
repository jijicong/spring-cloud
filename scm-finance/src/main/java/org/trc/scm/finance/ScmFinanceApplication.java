package org.trc.scm.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"org.trc.scm.finance","org.trc.scm.provider"})
@tk.mybatis.spring.annotation.MapperScan(basePackages = "org.trc.scm.finance.dao")
public class ScmFinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScmFinanceApplication.class, args);
	}

}

