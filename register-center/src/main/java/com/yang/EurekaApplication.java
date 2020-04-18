package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * eureka注册中心
 * @author mbcloud
 * @title: EurekaApplication
 * @description: TODO
 * @date 2020/4/18 18:21
 */
@EnableEurekaServer  //可以注册服务
@SpringBootApplication
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
