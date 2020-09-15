package com.classload;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//服务名称
@FeignClient("Eureka-Provider")
public interface ComputeService {

    //配置远程的服务请求
    @GetMapping("/add")
    // 必须指定 value属性
    int add(@RequestParam("a") int a, @RequestParam("b") int b);
}
