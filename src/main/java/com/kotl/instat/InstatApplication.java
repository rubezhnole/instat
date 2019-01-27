package com.kotl.instat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class InstatApplication {

    public static void main(String[] args) {
        SpringApplication.run(InstatApplication.class, args);
    }
}

