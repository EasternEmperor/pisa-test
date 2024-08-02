package com.research.pisatest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.research.pisatest.mapper")
public class PisaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PisaTestApplication.class, args);
    }

}
