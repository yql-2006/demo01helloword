package com.wzx.demo01helloword.pk02service;

import com.wzx.demo01helloword.bean.Account;
import com.wzx.demo01helloword.pk03dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService{

//    public List<Account> search(String key){
//        List<Account> list = new ArrayList<Account>();
//        for(int i = 0 ;i<5;i++){
//            Account a  = new Account();
//            a.setId(i+100+"");
//            a.setName(key+i);
//            a.setValue((double) (100+i));
//            list.add(a);
//        }//end for
//        return list;
//    }

    @Autowired
    AccountDao accountDao;
    public List<Account> search(String key){

        return accountDao.find(key);
    }
}