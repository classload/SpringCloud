package com.classload;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

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
@FeignClient(value = "Consul-Provider", fallback = HystrixConsulFeignService.class)
public interface ConsulFeignService {
    @GetMapping("/consul")
    String hello();
}
