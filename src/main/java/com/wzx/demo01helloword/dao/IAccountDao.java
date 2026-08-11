package com.wzx.demo01helloword.dao;

import com.wzx.demo01helloword.bean.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountDao extends JpaRepository<Account,String> {
}

