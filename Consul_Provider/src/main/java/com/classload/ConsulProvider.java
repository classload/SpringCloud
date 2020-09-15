package com.classload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <类功能描述>
 *
 * @author LD
 * @version V1.0
 * @project Eureka
 * @package com.classload
 * @file null.java
 * @copyright classload  ©2019
 * @time 2020/9/15 22:21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulProvider {
    public static void main(String[] args) {
        SpringApplication.run(ConsulProvider.class, args);
    }
}
