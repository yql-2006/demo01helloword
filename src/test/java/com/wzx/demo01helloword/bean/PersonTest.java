package com.wzx.demo01helloword.bean;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//调用SpringBoot测试
@SpringBootTest
@Slf4j
class PersonTest {



    @Test
    void save() {

        Person1 p1 = new Person1("jack",22);
        Person1 p2 = new Person1();

        p2.setName("Rose");

        System.out.println(p1);
        System.out.println(p2);

        log.info(p1.toString());
        log.info(p2.toString());


    }

}
