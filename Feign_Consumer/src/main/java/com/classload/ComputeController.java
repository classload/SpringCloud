package com.classload;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ComputeController {

    //定义feign服务
    //调用远程服务跟调用接口一样简单
    @Resource
    private ComputeService computeService;

    @GetMapping("/add")
    public int add() {
        //开始调用
        return computeService.add(10, 20);
    }
}
