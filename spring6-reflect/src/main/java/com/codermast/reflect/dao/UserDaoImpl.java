package com.codermast.reflect.dao;

import com.codermast.reflect.core.Bean;

@Bean
public class UserDaoImpl implements UserDao {

    @Override
    public void print() {
        System.out.println("Dao层执行结束");
    }
}