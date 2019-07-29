package com.lc.cloud.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * hello访问控制层.
 *
 * @author zyz.
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private CounterService counterService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String index() {
        // 统计访问hello的次数.
        counterService.increment("hello.count");

        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        logger.info("/hello, host: " + instance.getHost() + ", service id: " + instance.getServiceId());

        return "hello world";
    }
}
