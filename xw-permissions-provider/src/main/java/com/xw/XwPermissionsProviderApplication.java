package com.xw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.xw.*.mapper")
public class XwPermissionsProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XwPermissionsProviderApplication.class, args);
    }

}
