package com.example.securitypatchme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SecurityPatchMeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityPatchMeApplication.class, args);
    }

}
