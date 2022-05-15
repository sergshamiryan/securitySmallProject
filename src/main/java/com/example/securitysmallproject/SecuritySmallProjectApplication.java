package com.example.securitysmallproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories
public class SecuritySmallProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecuritySmallProjectApplication.class, args);
    }

}
