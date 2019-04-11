package com.example.keyvaluespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(TestProperties.class)
@SpringBootApplication
public class KeyvaultSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeyvaultSpringApplication.class, args);
    }

}
