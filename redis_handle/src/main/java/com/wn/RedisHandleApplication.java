package com.wn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RedisHandleApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisHandleApplication.class, args);
    }

}
