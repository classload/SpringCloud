package com.classload;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * <类功能描述>
 *
 * @author LD
 * @version V1.0
 * @project Eureka
 * @package com.classload
 * @file null.java
 * @copyright classload  ©2019
 * @time 2020/9/15 20:49
 */
@Service
public class ComputerService {

    @Resource
    private RestTemplate restTemplate;

    //系统无法访问 嗲用  info方法 返回信息
    @HystrixCommand(fallbackMethod = "info")
    public String addService(){
        return restTemplate.getForEntity("http://Eureka-Provider/add?a=10&b=20",String.class).getBody();
    }

    public String info(){
        return "系统暂时无法访问";
    }
}
