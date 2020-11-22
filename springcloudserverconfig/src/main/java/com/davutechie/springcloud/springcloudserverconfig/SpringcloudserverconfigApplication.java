package com.davutechie.springcloud.springcloudserverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudserverconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudserverconfigApplication.class, args);
    }

}
