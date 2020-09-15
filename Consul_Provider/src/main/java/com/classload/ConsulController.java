package com.classload;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <类功能描述>
 *
 * @author LD
 * @version V1.0
 * @project Eureka
 * @package com.classload
 * @file null.java
 * @copyright classload  ©2019
 * @time 2020/9/15 22:46
 */
@RestController
public class ConsulController {

    @GetMapping("/consul")
    public String hello() {
        return "consul2";
    }
}
