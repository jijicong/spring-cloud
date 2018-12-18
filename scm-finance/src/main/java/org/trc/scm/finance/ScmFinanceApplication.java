package org.trc.scm.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"org.trc.scm.finance","org.trc.scm.provider", "org.trc.scm.core"})
@tk.mybatis.spring.annotation.MapperScan(basePackages = "org.trc.scm.finance.dao")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ScmFinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScmFinanceApplication.class, args);
	}

}

