package com.sky.boot.service.dubbo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gantianxing on 2017/8/8.
 */
@Configuration
@ConfigurationProperties(prefix = "dubbo")
public class DubboConfig {

    private String zkAddress;

    private String alias;

    @Bean
    public OneService oneService(){
        OneService oneService= new OneService(zkAddress,alias);
        return oneService;
    }

    public void setZkAddress(String zkAddress) {
        this.zkAddress = zkAddress;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
