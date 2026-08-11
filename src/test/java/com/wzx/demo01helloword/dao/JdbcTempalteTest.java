package com.wzx.demo01helloword.dao;

import com.wzx.demo01helloword.bean.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

//调用SpringBoot测试
@SpringBootTest
class JdbcTempalteTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void save() {

        System.out.println(jdbcTemplate);
        String sql = "insert into account(id,name,value)values(?,?,?);";
        Account account = new Account("2002","李四他爸",300D);
        //jdbcTemplate.update(sql,"1001","李四",3000D);
        jdbcTemplate.update(sql,account.getId(),account.getName(),account.getValue());
    }
    @Test
    void delete() {
        String sql = "delete from account where id = ?;";
        jdbcTemplate.update(sql,"2002");
    }

    @Test
    void update() {
        String sql = "update account set name = ? where id = ?;";
        jdbcTemplate.update(sql,"李四他爸","102");
    }

    @Test
    void select() {
//        String sql = "select * from account;";
        String sql = "select * from account where id=?;";
        //jdbcTemplate方法 参1，sql 参2，值
        //jdbcTemplate方法 参1，sql 参2，转换器 参3 值
        BeanPropertyRowMapper<Account> rowMapper = new BeanPropertyRowMapper<>(Account.class);
        List<Account> list = jdbcTemplate.query(sql,rowMapper,"102");
        System.out.println(list);
    }
}
