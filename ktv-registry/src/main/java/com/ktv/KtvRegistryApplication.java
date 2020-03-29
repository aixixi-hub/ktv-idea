package com.ktv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KtvRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(KtvRegistryApplication.class, args);
    }

}
