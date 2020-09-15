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
 * @time 2020/9/15 20:49
 */
@RestController
public class ConsumerController {

    @Resource
    private ComputerService computerService;

    @GetMapping("/add")
    public String add() {
        return computerService.addService();
    }
}
