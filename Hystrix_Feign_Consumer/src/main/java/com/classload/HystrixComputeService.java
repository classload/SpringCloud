package com.classload;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <类功能描述>
 *
 * @author LD
 * @version V1.0
 * @project Eureka
 * @package com.classload
 * @file null.java
 * @copyright classload  ©2019
 * @time 2020/9/15 21:25
 */
//熔断返回
@Component
public class HystrixComputeService implements ComputeService {
    public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
        return -9999;
    }

}
