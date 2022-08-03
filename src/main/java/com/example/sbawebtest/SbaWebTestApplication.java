package com.example.sbawebtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class SbaWebTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbaWebTestApplication.class, args);
    }

}
