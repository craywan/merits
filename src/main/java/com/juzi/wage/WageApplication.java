package com.juzi.wage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.juzi.wage.dao")
public class WageApplication {

    public static void main(String[] args) {
        SpringApplication.run(WageApplication.class, args);
    }

}
