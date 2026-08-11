package com.wzx.demo01helloword.pk03dao;


import com.wzx.demo01helloword.bean.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //
    public List<Account>  find(String key) {

        String sql = "select * from account where  name like ?";

        BeanPropertyRowMapper<Account> rowMapper = new BeanPropertyRowMapper<>(Account.class);
        List<Account> list = jdbcTemplate.query(sql,rowMapper,"%"+key+"%");
        System.out.println(list);
        return list;
    }
}
