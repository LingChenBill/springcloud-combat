package com.lc.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello访问控制层.
 *
 * @author zyz.
 */
@RestController
public class HelloController {

    @Autowired
    private CounterService counterService;

    @RequestMapping("/hello")
    public String index() {
        // 统计访问hello的次数.
        counterService.increment("hello.count");

        return "hello world";
    }
}
