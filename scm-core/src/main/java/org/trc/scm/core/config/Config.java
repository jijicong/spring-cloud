package org.trc.scm.core.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;


/**
 * @Description: 数据库配置
 * @Author: hzluoxingcheng
 * @Date: 2018/12/18
 */
@Setter
@Getter
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
