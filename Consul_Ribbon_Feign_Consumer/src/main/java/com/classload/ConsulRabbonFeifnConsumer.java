package com.classload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * <类功能描述>
 *
 * @author LD
 * @version V1.0
 * @project Eureka
 * @package com.classload
 * @file null.java
 * @copyright classload  ©2019
 * @time 2020/9/15 23:01
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsulRabbonFeifnConsumer {
    public static void main(String[] args) {
        SpringApplication.run(ConsulRabbonFeifnConsumer.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
