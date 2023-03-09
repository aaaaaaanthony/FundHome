package com.fund.home.fundhome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fund.home.fundhome.mapper")
public class FundHomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FundHomeApplication.class, args);
    }

}
