package com.classload;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//服务名称
// fallback 熔断回调的对象
//feign默认以来hystix包 不需要引入
@FeignClient(value = "Eureka-Provider", fallback = HystrixComputeService.class)
public interface ComputeService {

    //配置远程的服务请求
    @GetMapping("/add")
    // 必须指定 value属性
    int add(@RequestParam("a") int a, @RequestParam("b") int b);
}
