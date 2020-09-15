package com.classload;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class ConsulService {
    @Resource
    private RestTemplate restTemplate;

    public String serviceHello() {
        return restTemplate.getForEntity("http://Consul-Provider/consul", String.class).getBody();
    }

    public String info() {
        return "服务不可用";
    }

}
