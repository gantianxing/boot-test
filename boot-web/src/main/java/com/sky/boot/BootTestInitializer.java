package com.sky.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by gantianxing on 2017/8/8.
 */
//@Configuration 配置类，类似xml
//@EnableAutoConfiguration  启动自动查找配置
//@ComponentScan  扫描自定包
@SpringBootApplication
@MapperScan("com.sky.boot.dao.mysql")
public class BootTestInitializer extends SpringBootServletInitializer{

    /**
     * 让spring boot在tomcat中运行
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BootTestInitializer.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BootTestInitializer.class, args);
    }
}
