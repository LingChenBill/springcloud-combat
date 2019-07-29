package com.lc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka server
 *
 * @author zyz.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main( String[] args ) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
