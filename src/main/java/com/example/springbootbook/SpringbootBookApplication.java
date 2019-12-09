package com.example.springbootbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringbootBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBookApplication.class, args);
    }

}
