package com.wzx.demo01helloword.mapper;

import com.wzx.demo01helloword.bean2.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountMapper {

    //delete from account where id = ?;
    @Delete("delete from account where id = #{id};")
    void deleteById(@Param("id") String id);

    //update account set name=?,value=? where id = ?;
    @Update("update account set name=#{name},value=#{value} where id = #{id};")
    void updateAccount(Account account);

//    insert into account (id,name,value)values(?,?,?);
    @Insert(" insert into account (id,name,value)values(#{id},#{name},#{value});")
    void addAccount(Account account);
//    id;
//    name;
//    value;

    @Select("select * from account;")
    List<Account> findAll();

    @Select("select * from account where id=#{id};")
    Account findById(@Param("id") String id);
}
