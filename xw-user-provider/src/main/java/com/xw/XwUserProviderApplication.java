package com.xw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class XwUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XwUserProviderApplication.class, args);
    }

}
