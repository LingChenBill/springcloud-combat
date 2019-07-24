package com.lc.cloud.springboothello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello访问控制层.
 *
 * @author zyz.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "hello world";
    }
}
