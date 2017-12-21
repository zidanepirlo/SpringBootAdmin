package com.yuan.springcloud;


import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminWebApplication.class, args);
    }
}
