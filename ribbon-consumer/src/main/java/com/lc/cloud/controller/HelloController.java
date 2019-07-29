package com.lc.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * hello访问控制层.
 *
 * @author zyz.
 */
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * ribbon消费接口.
     *
     * @return
     */
    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return this.restTemplate.getForEntity("http://service-hello/hello", String.class)
                .getBody();
    }

}
