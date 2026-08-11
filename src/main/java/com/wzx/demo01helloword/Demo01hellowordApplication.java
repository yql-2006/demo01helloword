package com.wzx.demo01helloword;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wzx.demo01helloword.mapper")
public class Demo01hellowordApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01hellowordApplication.class, args);
    }

}
