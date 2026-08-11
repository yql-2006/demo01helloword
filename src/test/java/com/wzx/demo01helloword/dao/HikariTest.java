package com.wzx.demo01helloword.dao;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

//调用SpringBoot测试
@SpringBootTest
@Slf4j
class HikariTest {

    @Autowired
    DataSource dataSource;

    @Test
    void save() {
        try {
            log.info(dataSource.getConnection().toString());
            log.info(dataSource.getConnection().toString());
            log.info(dataSource.getConnection().toString());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
