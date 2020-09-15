package com.classload;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
 * @time 2020/9/15 23:06
 */
@RestController
public class ConsulController {

    @Resource
    private ConsulService consulService;
    @Resource
    private ConsulFeignService consulFeignService;

    @GetMapping("hello-rabbon")
    public String hello() {
        return consulService.serviceHello();
    }

    @GetMapping("hello-feign")
    public String hello1() {
        return consulFeignService.hello();
    }
}
