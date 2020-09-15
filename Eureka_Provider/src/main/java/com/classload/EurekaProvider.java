package com.classload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
/**
 * 启用服务发现注册
 */
@EnableEurekaClient
//@EnableDiscoveryClient
public class EurekaProvider {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider.class, args);
    }
}
