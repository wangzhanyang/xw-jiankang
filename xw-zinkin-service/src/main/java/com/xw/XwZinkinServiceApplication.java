package com.xw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableZipkinStreamServer
public class XwZinkinServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(XwZinkinServiceApplication.class, args);
    }

}
