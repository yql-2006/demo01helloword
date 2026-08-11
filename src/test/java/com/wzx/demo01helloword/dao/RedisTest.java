package com.wzx.demo01helloword.dao;

import com.alibaba.fastjson.JSON;
import com.wzx.demo01helloword.bean.Account;
import com.wzx.demo01helloword.bean.Menu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

//调用SpringBoot测试
@SpringBootTest
class RedisTest {
    @Autowired
    RedisTemplate<String,String> redisTemplate;
    @Test
    void main1() {
        Menu menu1 = new Menu("1","机票1","http://www.baidu.com1");
        Menu menu2 = new Menu("2","酒店2","http://www.baidu.com2");
        Menu menu3 = new Menu("3","美食3","http://www.baidu.com3");

        List<Menu> mList = new ArrayList<Menu>();
        mList.add(menu1);
        mList.add(menu2);
        mList.add(menu3);

        //Json数据
        String json = JSON.toJSONString(mList);
        System.out.println(json);

        //参数key，保存时的名字
        redisTemplate.boundValueOps("menuData").set(json);
    }

    @Test
    void main2() {

        //参数key，取值
        String json = redisTemplate.boundValueOps("menuData").get();
        System.out.println(json);
    }
}
