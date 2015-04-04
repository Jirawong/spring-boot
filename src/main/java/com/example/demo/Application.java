package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.SpringServletContainerInitializer;

/**
 * @author Jirawong Wongdokpuang <greannetwork@gmail.com> on 4/4/2015 AD.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
public class Application extends SpringServletContainerInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
