package com.wzx.demo01helloword.dao;

import com.wzx.demo01helloword.bean.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//调用SpringBoot测试
@SpringBootTest
class AccountDaoTest {

    @Autowired
    IAccountDao accountDao;

    @Test
    void save() {

//        Account a = new Account("101","zhansan",100d);
//        accountDao.save(a);

        for (int i = 0; i < 10; i++) {
            Account a = new Account("10"+i,"zhansan"+i,100d+i);
            accountDao.save(a);
        }
    }
    @Test
    void delete() {
        accountDao.deleteById("101");
    }

    @Test
    void update() {
        Account account = accountDao.findById("102").get();
        account.setName("张三一夜暴富");
        account.setValue(1000000D);
        accountDao.save(account);
    }

    @Test
    void select() {
        List<Account> all =     accountDao.findAll();
        System.out.println(all);
        all.forEach(e-> System.out.println(e));

        System.out.println(accountDao.count());
    }
}
