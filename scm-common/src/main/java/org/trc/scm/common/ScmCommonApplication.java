package org.trc.scm.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by hzcyn on 2018/12/15.
 */

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ScmCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScmCommonApplication.class, args);
    }

}
