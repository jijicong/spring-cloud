package org.trc.scm.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by hzcyn on 2018/12/15.
 */

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "org.trc.scm.provider")
@ComponentScan(basePackages = {"org.trc.scm.common","org.trc.scm.provider"})
@tk.mybatis.spring.annotation.MapperScan(basePackages = "org.trc.scm.common.dao")
@SpringBootApplication
public class ScmCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScmCommonApplication.class, args);
    }

}
