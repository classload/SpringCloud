package com.classload;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

// 进行消费服务
@RestController
public class ConsumerController {


    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public String add() {
        //服务名不能使用下划线
        return restTemplate.getForEntity("http://Eureka-Provider/add?a=10&b=20", String.class).getBody();
    }

}
