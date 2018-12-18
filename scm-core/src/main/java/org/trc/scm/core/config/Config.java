package org.trc.scm.core.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


/**
 * @Description: 数据库配置
 * @Author: hzluoxingcheng
 * @Date: 2018/12/18
 */
@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class Config {

    @Value("${driver-class-name}")
    private String driverClassName;
    @Value("${url}")
    private String url;
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;

}
