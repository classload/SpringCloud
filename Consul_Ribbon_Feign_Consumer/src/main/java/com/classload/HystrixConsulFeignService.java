package com.classload;

import org.springframework.stereotype.Service;

/**
 * <类功能描述>
 *
 * @author LD
 * @version V1.0
 * @project Eureka
 * @package com.classload
 * @file null.java
 * @copyright classload  ©2019
 * @time 2020/9/15 23:17
 */
@Service
public class HystrixConsulFeignService implements ConsulFeignService {

    public String hello() {
        return "你的服务挂掉了";
    }
}
