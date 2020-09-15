package com.classload;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.logging.Logger;

//提供服务
@RestController
public class ComputeController {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    //获取服务注册对象
    @Resource
    private EurekaClient client;
    //    private DiscoveryClient client;
    @Resource
    Registration registration;

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        //获取服务实例
        List<InstanceInfo> serviceInstances = client.getInstancesById(registration.getInstanceId());
        serviceInstances.forEach(instance -> {
            logger.info(instance.toString());
        });
        return a + b;
    }

}
