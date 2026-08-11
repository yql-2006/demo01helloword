package com.wzx.demo01helloword.dao;

import com.wzx.demo01helloword.bean2.Account;
import com.wzx.demo01helloword.mapper.AccountMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//调用SpringBoot测试
@SpringBootTest
class MybatisTest {


    @Autowired
    AccountMapper accountMapper;

    @Test
    void list() {
//        List<Account> list = accountMapper.findAll();
//        System.out.println(list);
        Account account = accountMapper.findById("10444");
        System.out.println(account);
    }

    @Test
    void save() {
        Account a = new Account("10444","zhansan4444",100d);
        accountMapper.addAccount(a);
    }

    @Test
    void update() {
        Account a = new Account("10444","王思聪",100000d);
        accountMapper.updateAccount(a);
    }

    @Test
    void delete() {

        accountMapper.deleteById("102");
    }
}
