package com.spring.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class BootcampApplication {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        SpringApplication.run(BootcampApplication.class, args);
    }
}
